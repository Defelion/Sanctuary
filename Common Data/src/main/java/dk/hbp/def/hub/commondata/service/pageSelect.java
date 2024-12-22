package dk.hbp.def.hub.commondata.service;

import dk.hbp.def.hub.commondata.data.Menu;
import dk.hbp.def.hub.commondata.data.MenuItem;
import dk.hbp.def.hub.commondata.data.Page;
import dk.hbp.def.hub.commondata.data.User;

public interface pageSelect {
    public Menu getMenu();
    public Menu getMenuById(int id);
    public Menu getMenuByName(String name);
    public Menu getMenuByPage(Page page);
    public Menu getMenuByUser(User user);
    public Menu[] getAllMenu();
    public MenuItem getSubMenu();
    public MenuItem getSubMenuById(int id);
    public MenuItem getSubMenyByMenuId(int id);
    public MenuItem[] getAllSubMenu();
    public MenuItem[] getAllSubMenuByMenuId(int id);
    public Page getPage(Page page);
    public Page getPageById(int id);
    public Page getPageByName(String name);
    public Page getPageByType(String type);
}
