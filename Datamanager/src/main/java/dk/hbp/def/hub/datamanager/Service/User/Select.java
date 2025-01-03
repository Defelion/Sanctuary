package dk.hbp.def.hub.datamanager.Service.User;

import dk.hbp.def.hub.commondata.data.*;
import dk.hbp.def.hub.commondata.service.userSelect;
import dk.hbp.def.hub.datamanager.DBCrud;
import dk.hbp.def.hub.datamanager.DBCrudSelect;
import dk.hbp.def.hub.datamanager.Objects.Selected;

import java.util.ArrayList;

public class Select implements userSelect {
    DBCrud dbCrud = new DBCrud();
    DBCrudSelect dbCrudSelect = new DBCrudSelect();
    /**
     * @param user
     * @return
     */
    @Override
    public User getUser(User user) {
        return null;
    }

    /**
     * @param person
     * @return
     */
    @Override
    public User getUserByPerson(Person person) {
        return null;
    }

    /**
     * @param email
     * @return
     */
    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    /**
     * @param username
     * @return
     */
    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User getUserById(int id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public User[] getUsers() {
        return new User[0];
    }

    /**
     * @param person
     * @return
     */
    @Override
    public Person getPerson(Person person) {
        return null;
    }

    /**
     * @param email
     * @return
     */
    @Override
    public Person getPersonByEmail(Email email) {
        return null;
    }

    /**
     * @param phone
     * @return
     */
    @Override
    public Person getPersonByPhone(Phone phone) {
        return null;
    }

    /**
     * @param username
     * @return
     */
    @Override
    public Person getPersonByUsername(String username) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Person getPersonByID(int id) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Person[] getPersons() {
        return new Person[0];
    }

    /**
     * @param address
     * @return
     */
    @Override
    public Address getAddress(Address address) {
        return null;
    }

    /**
     * @param person
     * @return
     */
    @Override
    public Address getAddressByPerson(Person person) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Address[] getAddresses() {
        return new Address[0];
    }

    /**
     * @param person
     * @return
     */
    @Override
    public Address[] getAddressesByPerson(Person person) {
        return new Address[0];
    }

    /**
     * @param city
     * @return
     */
    @Override
    public Address[] getAddressesByCity(City city) {
        return new Address[0];
    }

    /**
     * @param city
     * @return
     */
    @Override
    public City getCity(City city) {
        ArrayList<Selected> selecteds = new ArrayList<>();
        selecteds.add(new Selected("city", ""));
        dbCrud.SelectFromDB("city",);
        return city;
    }

    /**
     * @return
     */
    @Override
    public City[] getCities() {

        return new City[0];
    }

    /**
     * @return
     */
    @Override
    public Phone[] getPhones() {
        return new Phone[0];
    }

    /**
     * @param person
     * @return
     */
    @Override
    public Phone[] getPhonesByPerson(Person person) {
        return new Phone[0];
    }

    /**
     * @return
     */
    @Override
    public Email[] getEmails() {
        return new Email[0];
    }

    /**
     * @param person
     * @return
     */
    @Override
    public Email[] getEmailsByPerson(Person person) {
        return new Email[0];
    }

    /**
     * @return
     */
    @Override
    public Other[] getOthers() {
        return new Other[0];
    }

    /**
     * @param person
     * @return
     */
    @Override
    public Other[] getOthersByPerson(Person person) {
        return new Other[0];
    }

    /**
     * @param type
     * @return
     */
    @Override
    public Other[] getOthersByType(String type) {
        return new Other[0];
    }
}
