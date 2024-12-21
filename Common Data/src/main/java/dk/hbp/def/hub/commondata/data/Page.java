package dk.hbp.def.hub.commondata.data;

import java.util.ArrayList;

public class Page {
    private int id;
    private String title;
    private String type;
    private String css;
    private int colAmount;
    private int rowAmount;
    private ArrayList<Section> sections;

    public Page () { sections = new ArrayList<>();}
    public Page (int id, String title, String type, String css, int colAmount, int rowAmount, ArrayList<Section>  sections) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.css = css;
        this.colAmount = colAmount;
        this.rowAmount = rowAmount;
        this.sections = sections;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getCss() { return css; }
    public void setCss(String css) { this.css = css; }
    public int getColAmount() { return colAmount; }
    public void setColAmount(int colAmount) { this.colAmount = colAmount; }
    public int getRowAmount() { return rowAmount; }
    public void setRowAmount(int rowAmount) { this.rowAmount = rowAmount; }
    public ArrayList<Section> getSections() { return sections; }
    public void setSections(ArrayList<Section> sections) { this.sections = sections; }
    public Section getSectionByIndex(int idx) { return sections.get(idx); }
    public void addSection(Section section) { this.sections.add(section); }
    public void removeSection(Section section) { this.sections.remove(section); }
}
