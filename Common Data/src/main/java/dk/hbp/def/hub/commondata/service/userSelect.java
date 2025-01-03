package dk.hbp.def.hub.commondata.service;

import dk.hbp.def.hub.commondata.data.*;

public interface userSelect {
    public User getUser(User user);
    public User getUserByPerson(Person person);
    public User getUserByEmail(String email);
    public User getUserByUsername(String username);
    public User getUserById(int id);
    public User[] getUsers();
    public Person getPerson(Person person);
    public Person getPersonByEmail(Email email);
    public Person getPersonByPhone(Phone phone);
    public Person getPersonByUsername(String username);
    public Person getPersonByID(int id);
    public Person[] getPersons();
    public Address getAddress(Address address);
    public Address getAddressByPerson(Person person);
    public Address[] getAddresses();
    public Address[] getAddressesByPerson(Person person);
    public Address[] getAddressesByCity(City city);
    public City getCity(City city);
    public City[] getCities();
    public Phone[] getPhones();
    public Phone[] getPhonesByPerson(Person person);
    public Email[] getEmails();
    public Email[] getEmailsByPerson(Person person);
    public Other[] getOthers();
    public Other[] getOthersByPerson(Person person);
    public Other[] getOthersByType(String type);
}
