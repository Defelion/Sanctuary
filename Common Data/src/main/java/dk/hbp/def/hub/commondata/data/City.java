package dk.hbp.def.hub.commondata.data;

public class City {
    private int zip;
    private String name;
    private String country;

    public City() {}
    public City(int zip, String name, String country) { this.zip = zip; this.name = name; this.country = country; }

    public int getZip() { return zip; }
    public void setZip(int zip) { this.zip = zip; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}
