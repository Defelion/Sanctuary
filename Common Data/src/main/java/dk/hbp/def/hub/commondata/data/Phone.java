package dk.hbp.def.hub.commondata.data;

public class Phone {
    private String number;
    private String countryCode;

    public Phone() {}
    public Phone(String number, String countryCode) { this.number = number; this.countryCode = countryCode; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
}
