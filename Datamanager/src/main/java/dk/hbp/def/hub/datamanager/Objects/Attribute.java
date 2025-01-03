package dk.hbp.def.hub.datamanager.Objects;

public class Attribute {
    private String coloumn;
    private String value;

    public Attribute() {}
    public Attribute(String coloumn, String value) { this.coloumn = coloumn; this.value = value; }

    public String getColoumn() { return coloumn; }
    public void setColoumn(String coloumn) { this.coloumn = coloumn; }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
}
