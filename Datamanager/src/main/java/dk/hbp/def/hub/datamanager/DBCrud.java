package dk.hbp.def.hub.datamanager;

import dk.hbp.def.hub.datamanager.Objects.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

public class DBCrud {

    // insert into table (coloumns) values (values)
    public int insertIntoDB (String table, ArrayList<Attribute> attributes) throws IOException {
        Conn conn = new Conn();
        int id = 0;
        try(var connection = conn.getConnection()) {
            var TableSQL = "insert into " + table + " (";
            var ValuesSQL = "values (";
            boolean notfirst = false;
            for(Attribute attribute : attributes) {
                if(notfirst) TableSQL += ", ";
                TableSQL += attribute.getColoumn();
                if(notfirst) ValuesSQL += ", ";
                ValuesSQL += "?";
                notfirst = true;
            }
            TableSQL += ") ";
            ValuesSQL += ")";
            var sql = TableSQL+ValuesSQL;
            var insertSQL = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            int i = 0;
            for(Attribute attribute : attributes) {
                i++;
                insertSQL.setObject(i, attribute.getValue());
            }
            if(insertSQL.executeUpdate() > 0) {
                var generatedKeys = insertSQL.getGeneratedKeys();
                if(generatedKeys.next()) { id = generatedKeys.getInt(1); }
            }
            insertSQL.close();
        } catch (SQLException e) {
            id = -2;
            System.out.println("insertIntoDBSecure: " + e.getMessage());
        }
        return id;
    }

    // update table set coloumn = value where coloumn operator value
    public int UpdateDB (String table, ArrayList<Set> set, ArrayList<Where> wheres) throws IOException {
        Conn conn = new Conn();
        int id = 0;
        try(var connection = conn.getConnection()) {
            var TableSQL = "update " + table;
            var SetSQL = " set ";
            var WhereSQL = WhereMethod(wheres);
            boolean notfirst = false;
            for(Set colValue : set) {
                if(notfirst) TableSQL += ", ";
                TableSQL += colValue.getColoumn() + " = ?";
                notfirst = true;
            }
            var sql = TableSQL+SetSQL+WhereSQL;
            var updateSQL = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            int i = 0;
            for(Set colValue : set) {
                i++;
                updateSQL.setObject(i, colValue.getValue());
            }
            for(Where where : wheres) {
                i++;
                updateSQL.setObject(i, where.getValue());
            }
            if(updateSQL.executeUpdate() > 0) {
                var generatedKeys = updateSQL.getGeneratedKeys();
                if(generatedKeys.next()) { id = generatedKeys.getInt(1); }
            }
            updateSQL.close();
        } catch (SQLException e) {
            id = -2;
            System.out.println("insertIntoDBSecure: " + e.getMessage());
        }
        return id;
    }

    // delete from table1 'joins table2 on table1.coloumn opperator table2.coloumn' where table.coloumn operator value
    public int DeleteFromDB (String table, ArrayList<Join> joins, ArrayList<Where> wheres) throws IOException {
        Conn conn = new Conn();
        int id = 0;
        try(var connection = conn.getConnection()) {
            var TableSQL = "delete from " + table;
            var JoinSQL = JoinMethod(joins);
            var WhereSQL = WhereMethod(wheres);
            var sql = TableSQL+JoinSQL+WhereSQL;
            var deleteSQL = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            int i = 0;
            for(Where where : wheres) {
                i++;
                deleteSQL.setObject(i, where.getValue());
            }
            if(deleteSQL.executeUpdate() > 0) {
                var generatedKeys = deleteSQL.getGeneratedKeys();
                if(generatedKeys.next()) { id = generatedKeys.getInt(1); }
            }
            deleteSQL.close();
        } catch (SQLException e) {
            id = -2;
            System.out.println("insertIntoDBSecure: " + e.getMessage());
        }
        return id;
    }

    // select table1.coloumn from table1 joins table2 on table1.coloumn = table2.coloumn
    // where table.coloumn opperator value ordered by coloumn
    public ResultSet SelectFromDB (
            String table,
            ArrayList<Selected> selecteds,
            ArrayList<Join> joins,
            ArrayList<Where> wheres,
            String Ordered
    ) throws IOException {
        Conn conn = new Conn();
        ArrayList<Object> results = new ArrayList<>();
        ResultSet resultSet = null;
        try(var connection = conn.getConnection()) {
            var ColoumnSQL = "select ";
            boolean notfirst = false;
            for(Selected selected : selecteds) {
                if(notfirst) ColoumnSQL += ", ";
                ColoumnSQL += selected.getTable() + "." + selected.getColumn() + " ";
                notfirst = true;
            }
            var TableSQL = " from " + table + " ";
            var JoinSQL = JoinMethod(joins);
            var WhereSQL = WhereMethod(wheres);
            var sql = ColoumnSQL + TableSQL + JoinSQL + WhereSQL;
            if(Ordered != null) sql += " order by " + Ordered;
            var selectSQL = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            int i = 0;
            for(Where where : wheres) {
                i++;
                selectSQL.setObject(i, where.getValue());
            }
            resultSet = selectSQL.executeQuery();
            selectSQL.close();
        } catch (SQLException e) {
            System.out.println("insertIntoDBSecure: " + e.getMessage());
        }
        return resultSet;
    }

    private String JoinMethod (ArrayList<Join> joins) {
        String JoinSQL = "";
        for(Join join : joins) {
            JoinSQL += join.getJoinType() + " ";
            JoinSQL += join.getTable1() + " on ";
            JoinSQL += join.getTable1() + "." + join.getColoumn1() + " = ";
            JoinSQL += join.getTable2() + "." + join.getColoumn2() + " ";
        }
        return JoinSQL;
    }

    private String WhereMethod (ArrayList<Where> wheres) {
        String WhereSQL = "where ";
        for(Where where : wheres) {
            if(where.getAdditionalOperator() != null)
                WhereSQL += where.getAdditionalOperator() + " ";
            WhereSQL += where.getColoumn() + " ";
            WhereSQL += where.getClauseOperator() + " ? ";
        }
        return WhereSQL;
    }
}
