package dk.hbp.def.hub.commondata.data;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Address {
    private int id;
    private int number;
    private String street;
    private City city;

    public Address() {}
    public Address(int id, int number, String street, City city)
        { this.id = id; this.number = number; this.street = street; this.city = city; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
    public City getCity() { return city; }
    public void setCity(City city) { this.city = city; }
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
}
