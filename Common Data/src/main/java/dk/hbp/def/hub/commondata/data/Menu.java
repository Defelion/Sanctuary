package dk.hbp.def.hub.commondata.data;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu() {}
    public Menu(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }
    public ArrayList<MenuItem> getMenuItems() { return menuItems; }

    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }
    public void addMenuItem(MenuItem menuItem) { this.menuItems.add(menuItem); }
    public void removeMenuItem(MenuItem menuItem) { this.menuItems.remove(menuItem); }
}
