package dk.hbp.def.hub.commondata.data;

import java.util.ArrayList;
import java.util.Date;

public class Person {
    private int id;
    private String firstname;
    private String lastname;
    private Date birthday;
    private Address address;
    private ArrayList<Phone> phones;
    private ArrayList<Email> emails;
    private ArrayList<Other> others;

    public Person() {
        phones = new ArrayList<>();
        emails = new ArrayList<>();
        others = new ArrayList<>();
    }


    public Person(int id, String firstname, String lastname, Date birthday, Address address, ArrayList<Phone> phones, ArrayList<Email> emails, ArrayList<Other> others) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.address = address;
        this.phones = phones;
        this.emails = emails;
        this.others = others;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public Date getBirthday() { return birthday; }
    public void setBirthday(Date birthday) { this.birthday = birthday; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    public ArrayList<Phone> getPhones() { return phones; }
    public void setPhones(ArrayList<Phone> phones) { this.phones = phones; }
    public void addPhone(Phone phone) { this.phones.add(phone); }
    public void removePhone(Phone phone) { this.phones.remove(phone); }
    public ArrayList<Email> getEmails() { return emails; }
    public void setEmails(ArrayList<Email> emails) { this.emails = emails; }
    public void addEmail(Email email) { this.emails.add(email); }
    public void removeEmail(Email email) { this.emails.remove(email); }
    public ArrayList<Other> getOthers() { return others; }
    public void setOthers(ArrayList<Other> others) { this.others = others; }
    public void addOther(Other other) { this.others.add(other); }
    public void removeOther(Other other) { this.others.remove(other); }
}
