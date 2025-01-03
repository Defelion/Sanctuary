package dk.hbp.def.hub.commondata.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User {
    private int id;
    private String name;
    private String password;
    private Person person;
    private ArrayList<Role> Roles;

    public User() { Roles = new ArrayList<>(); }
    public User(int id, String name, String password, Person person, ArrayList<Role> Roles) {
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
    public ArrayList<Role> getRoles() { return Roles; }
    public void setRoles(ArrayList<Role> roles) { Roles = roles; }
    public void addRole(Role role) { Roles.add(role); }
    public void removeRole(Role role) { Roles.remove(role); }
}
