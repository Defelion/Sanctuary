package dk.hbp.def.hub.commondata.data;

import java.util.ArrayList;

public class MenuItem {
    private int id;
    private String title;
    private Page page;
    private int Parrent;
    private ArrayList<MenuItem> children;

    public MenuItem() {}
    public MenuItem(int id, String title, Page page, int Parrent) {
        this.id = id;
        this.title = title;
        this.page = page;
        this.Parrent = Parrent;
    }
    public MenuItem(int id, String title, Page page, int Parrent, ArrayList<MenuItem> children) {
        this.id = id;
        this.title = title;
        this.page = page;
        this.Parrent = Parrent;
        this.children = children;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Page getPage() { return page; }
    public void setPage(Page page) { this.page = page; }
    public ArrayList<MenuItem> getChildren() { return children; }
    public void setChildren(ArrayList<MenuItem> children) { this.children = children; }
    public void addChild(MenuItem child) { children.add(child); }
    public void removeChild(MenuItem child) { children.remove(child); }
    public int getParrent() { return Parrent; }
    public void setParrent(int Parrent) { this.Parrent = Parrent; }
}
