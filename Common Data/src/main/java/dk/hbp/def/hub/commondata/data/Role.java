package dk.hbp.def.hub.commondata.data;

public class Role {
    private int id;
    private Page page;
    private String role;

    public Role() {}
    public Role(int id, Page page, String role) { this.id = id; this.page = page; this.role = role; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Page getPage() { return page; }
    public void setPage(Page page) { this.page = page; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
