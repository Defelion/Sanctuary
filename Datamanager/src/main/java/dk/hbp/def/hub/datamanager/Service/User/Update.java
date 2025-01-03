package dk.hbp.def.hub.datamanager.Service.User;

import dk.hbp.def.hub.commondata.data.*;
import dk.hbp.def.hub.commondata.service.userUpdate;

public class Update implements userUpdate {
    /**
     * @param user
     * @return
     */
    @Override
    public int changeUser(User user) {
        return 0;
    }

    /**
     * @param newPassword
     * @param user
     * @return
     */
    @Override
    public int changePassword(String newPassword, User user) {
        return 0;
    }

    /**
     * @param email
     * @param person
     * @return
     */
    @Override
    public int changeEmail(Email email, Person person) {
        return 0;
    }

    /**
     * @param phone
     * @param person
     * @return
     */
    @Override
    public int changePhone(Phone phone, Person person) {
        return 0;
    }

    /**
     * @param address
     * @param person
     * @return
     */
    @Override
    public int changeAddress(Address address, Person person) {
        return 0;
    }

    /**
     * @param city
     * @param person
     * @return
     */
    @Override
    public int changeCity(City city, Person person) {
        return 0;
    }

    /**
     * @param newName
     * @param person
     * @return
     */
    @Override
    public int changeName(String newName, Person person) {
        return 0;
    }

    /**
     * @param other
     * @param person
     * @return
     */
    @Override
    public int changeOther(Other other, Person person) {
        return 0;
    }
}
