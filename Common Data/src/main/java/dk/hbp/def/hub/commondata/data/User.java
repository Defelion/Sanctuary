package dk.hbp.def.hub.commondata.data;

public class User {
    private int id;
    private String name;
    private String password;
    private Person person;

    public User() {}
    public User(int id, String name, String password, Person person) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.person = person;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }
}
