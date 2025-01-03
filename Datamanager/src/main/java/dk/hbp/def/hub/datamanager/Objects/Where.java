package dk.hbp.def.hub.datamanager.Objects;

public class Where {
    private String coloumn;
    private String value;
    private String clauseOperator;
    private String table;
    private String additionalOperator;

    public Where() {
    }
    public Where(String coloumn, String value, String clauseOperator, String table, String additionalOperator) {
        this.coloumn = coloumn;
        this.value = value;
        this.clauseOperator = clauseOperator;
        this.table = table;
        this.additionalOperator = additionalOperator;
    }

    public String getColoumn() { return coloumn; }
    public void setColoumn(String coloumn) { this.coloumn = coloumn; }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    public String getClauseOperator() { return clauseOperator; }
    public void setClauseOperator(String clauseOperator) { this.clauseOperator = clauseOperator; }
    public String getTable() { return table; }
    public void setTable(String table) { this.table = table; }
    public String getAdditionalOperator() { return additionalOperator; }
    public void setAdditionalOperator(String additionalOperator) { this.additionalOperator = additionalOperator; }
}
