package dk.hbp.def.hub.commondata.service;

import dk.hbp.def.hub.commondata.data.*;

public interface userDelete {
    public int deleteUser(User user);
    public int deleteUserById(int id);
    public int deleteUserByName(String username);
    public int deletePerson(Person person);
    public int deletePersonById(int id);
    public int deletePersonByName(String username);
    public int deleteCity(City city);
    public int deletePhone(Phone phone);
    public int deletePhoneByNumber(int number);
    public int deletePhoneByPerson(Person person);
    public int deleteEmail(Email email);
    public int deleteEmailByID(int id);
    public int deleteEmailByPerson(Person person);
    public int deleteOther(Other other);
    public int deleteOtherById(int id);
    public int deleteOtherByPerson(Person person);
}
