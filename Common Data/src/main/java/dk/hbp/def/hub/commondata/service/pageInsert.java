package dk.hbp.def.hub.commondata.service;

import dk.hbp.def.hub.commondata.data.Menu;
import dk.hbp.def.hub.commondata.data.MenuItem;
import dk.hbp.def.hub.commondata.data.Page;
import dk.hbp.def.hub.commondata.data.Section;

public interface pageInsert {
    public int menuInsert(Menu menu);
    public int subMenuInsert(MenuItem menuItem);
    public int pageInsert(Page page);
    public int sectionInsert(Section section);
}
