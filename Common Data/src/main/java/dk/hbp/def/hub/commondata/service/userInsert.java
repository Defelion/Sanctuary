package dk.hbp.def.hub.commondata.service;

import dk.hbp.def.hub.commondata.data.*;

public interface userInsert {
    public int addUser(User user);
    public int addPerson(Person person);
    public int addPerson(Person person, User user);
    public int addAddress(Address address, Person person);
    public int addCity(City city);
    public int addEmail(Email email, Person person);
    public int addPhone(Phone phone, Person person);
    public int addOther(Other other, Person person);
}
