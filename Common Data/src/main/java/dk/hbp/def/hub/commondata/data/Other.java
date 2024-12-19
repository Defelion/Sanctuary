package dk.hbp.def.hub.commondata.data;

public class Other {
    private int id;
    private String name;
    private String type;
    private String data;

    public Other() {}
    public Other(int id, String name, String type, String data)
        { this.id = id; this.name = name; this.type = type; data = data; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
}
