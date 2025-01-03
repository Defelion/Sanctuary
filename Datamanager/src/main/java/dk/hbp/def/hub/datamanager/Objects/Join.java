package dk.hbp.def.hub.datamanager.Objects;

public class Join {
    private String joinType;
    private String table1;
    private String table2;
    private String coloumn1;
    private String coloumn2;

    public Join() {}
    public Join(String joinType, String table1, String table2, String coloumn1, String coloumn2) {
        this.joinType = joinType;
        this.table1 = table1;
        this.table2 = table2;
        this.coloumn1 = coloumn1;
        this.coloumn2 = coloumn2;
    }

    public String getJoinType() { return joinType; }
    public void setJoinType(String joinType) { this.joinType = joinType; }
    public String getTable1() { return table1; }
    public void setTable1(String table1) { this.table1 = table1; }
    public String getTable2() { return table2; }
    public void setTable2(String table2) { this.table2 = table2; }
    public String getColoumn1() { return coloumn1; }
    public void setColoumn1(String coloumn1) { this.coloumn1 = coloumn1; }
    public String getColoumn2() { return coloumn2; }
    public void setColoumn2(String coloumn2) { this.coloumn2 = coloumn2; }
}
