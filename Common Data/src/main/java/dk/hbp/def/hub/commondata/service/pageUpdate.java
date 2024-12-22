package dk.hbp.def.hub.commondata.service;

import dk.hbp.def.hub.commondata.data.Menu;
import dk.hbp.def.hub.commondata.data.MenuItem;
import dk.hbp.def.hub.commondata.data.Page;
import dk.hbp.def.hub.commondata.data.Section;

public interface pageUpdate {
    public int menuUpdate(Menu menu);
    public int subMenuUpdate(MenuItem menuItem);
    public int pageUpdate(Page page);
    public int sectionUpdate(Section section);
}
