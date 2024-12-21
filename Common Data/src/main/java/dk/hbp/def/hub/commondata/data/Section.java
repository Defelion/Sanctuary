package dk.hbp.def.hub.commondata.data;

public class Section {
    private int id;
    private int col;
    private int row;
    private String header;
    private String body;

    public Section() {}
    public Section(int id, int col, int row, String header, String body) {
        this.id = id;
        this.col = col;
        this.row = row;
        this.header = header;
        this.body = body;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getCol() { return col; }
    public void setCol(int col) { this.col = col; }
    public int getRow() { return row; }
    public void setRow(int row) { this.row = row; }
    public String getHeader() { return header; }
    public void setHeader(String header) { this.header = header; }
    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }
}
