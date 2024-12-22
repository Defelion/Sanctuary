package dk.hbp.def.hub.commondata.service;

import dk.hbp.def.hub.commondata.data.Menu;
import dk.hbp.def.hub.commondata.data.MenuItem;
import dk.hbp.def.hub.commondata.data.Page;
import dk.hbp.def.hub.commondata.data.Section;

public interface pageDelete {
    public int menuDelete(Menu menu);
    public int subMenuDelete(MenuItem menuItem);
    public int pageDelete(Page page);
    public int sectionDelete(Section section);
}
