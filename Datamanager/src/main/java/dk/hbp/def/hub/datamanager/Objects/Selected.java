package dk.hbp.def.hub.datamanager.Objects;

public class Selected {
    private String table;
    private String column;

    public Selected() {}
    public Selected(String table, String column) { this.table = table; this.column = column; }

    public String getTable() { return table; }
    public void setTable(String table) { this.table = table; }
    public String getColumn() { return column; }
    public void setColumn(String column) { this.column = column; }
}
