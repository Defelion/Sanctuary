package dk.hbp.def.hub.commondata.data;

import java.util.HashMap;
import java.util.Map;

public class User {
    private int id;
    private String name;
    private String password;
    private Person person;
    private Map<MenuItem, String> Roles;

    public User() { Roles = new HashMap<MenuItem, String>(); }
    public User(int id, String name, String password, Person person, Map<MenuItem, String> Roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.person = person;
        this.Roles = Roles;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }
    public Map<MenuItem, String> getRoles() { return Roles; }
    public void setRoles(Map<MenuItem, String> roles) { Roles = roles; }
    public void addRole(MenuItem menuItem, String role) { Roles.put(menuItem, role); }
    public void removeRole(MenuItem menuItem) { Roles.remove(menuItem); }
}
