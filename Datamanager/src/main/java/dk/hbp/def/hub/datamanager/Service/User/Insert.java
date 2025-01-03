package dk.hbp.def.hub.datamanager.Service.User;

import dk.hbp.def.hub.commondata.data.*;
import dk.hbp.def.hub.commondata.service.userInsert;
import dk.hbp.def.hub.datamanager.DBCrud;
import dk.hbp.def.hub.datamanager.DBCrudSelect;

public class Insert implements userInsert {

    /**
     * @param user
     * @return
     */
    @Override
    public int addUser(User user) {
        DBCrud dbCrud = new DBCrud();
        if(user.getPerson() != null) {
            if (user.getPerson().getAddress() != null) {
                if (user.getPerson().getAddress().getCity() != null) {

                }
            }
        }
        return 0;
    }

    /**
     * @param person
     * @return
     */
    @Override
    public int addPerson(Person person) {
        return 0;
    }

    /**
     * @param person
     * @param user
     * @return
     */
    @Override
    public int addPerson(Person person, User user) {
        return 0;
    }

    /**
     * @param address
     * @param person
     * @return
     */
    @Override
    public int addAddress(Address address, Person person) {
        return 0;
    }

    /**
     * @param city
     * @return
     */
    @Override
    public int addCity(City city) {
        return 0;
    }

    /**
     * @param email
     * @param person
     * @return
     */
    @Override
    public int addEmail(Email email, Person person) {
        return 0;
    }

    /**
     * @param phone
     * @param person
     * @return
     */
    @Override
    public int addPhone(Phone phone, Person person) {
        return 0;
    }

    /**
     * @param other
     * @param person
     * @return
     */
    @Override
    public int addOther(Other other, Person person) {
        return 0;
    }
}
