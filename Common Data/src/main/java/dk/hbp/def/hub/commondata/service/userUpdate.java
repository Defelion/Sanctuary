package dk.hbp.def.hub.commondata.service;

import dk.hbp.def.hub.commondata.data.*;

public interface userUpdate {
    public int changeUser(User user);
    public int changePassword(String newPassword, User user);
    public int changeEmail(Email email, Person person);
    public int changePhone(Phone phone, Person person);
    public int changeAddress(Address address, Person person);
    public int changeCity(City city, Person person);
    public int changeName(String newName, Person person);
    public int changeOther(Other other, Person person);

}
