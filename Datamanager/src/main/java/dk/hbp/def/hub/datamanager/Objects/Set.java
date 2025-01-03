package dk.hbp.def.hub.datamanager.Objects;

public class Set {
    private String Coloumn;
    private String Value;

    public Set() {}
    public Set(String coloumn, String value, String type) { this.Coloumn = coloumn; this.Value = value; }

    public String getColoumn() { return Coloumn; }
    public void setColoumn(String Coloumn) { this.Coloumn = Coloumn; }
    public String getValue() { return Value; }
    public void setValue(String Value) { this.Value = Value; }
}
