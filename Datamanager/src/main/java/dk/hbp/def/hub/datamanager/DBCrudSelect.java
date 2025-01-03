package dk.hbp.def.hub.datamanager;

import dk.hbp.def.hub.commondata.data.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBCrudSelect {
    public City[] CitySelection (ResultSet resultSet) throws SQLException {
        ArrayList<City> cities = new ArrayList<>();
        while(resultSet.next()) {
            City city = new City();
            if(resultSet.getString("city.name") != null)
                city.setName(resultSet.getString("city.name"));
            if(resultSet.getString("city.country") != null)
                city.setCountry(resultSet.getString("city.country"));
            if(resultSet.getString("city.zip") != null)
                city.setZip(resultSet.getInt("city.zip"));
            cities.add(city);
        }
        return cities.toArray(new City[cities.size()]);
    }

    public Address[] AddressSelection (ResultSet resultSet) throws SQLException {
        ArrayList<Address> addresses = new ArrayList<Address>();

        while(resultSet.next()) {
            Address address = new Address();
            if(resultSet.getString("address.id") != null)
                address.setId(resultSet.getInt("address.id"));
            if(resultSet.getString("address.street") != null)
                address.setStreet(resultSet.getString("address.street"));
            if(resultSet.getString("address.city") != null)
                address.setNumber(resultSet.getInt("address.number"));
            addresses.add(address);
        }

        return addresses.toArray(new Address[addresses.size()]);
    }

    public Phone[] PhoneSelection (ResultSet resultSet) throws SQLException {
        ArrayList<Phone> phones = new ArrayList<>();
        while(resultSet.next()) {
            Phone phone = new Phone();
            if(resultSet.getString("phone.number") != null)
                phone.setNumber(resultSet.getString("phone.number"));
            if(resultSet.getString("phone.type") != null)
                phone.setCountryCode(resultSet.getString("phone.countryCode"));
            phones.add(phone);
        }
        return phones.toArray(new Phone[phones.size()]);
    }

    public Email[] EmailSelection (ResultSet resultSet) throws SQLException {
        ArrayList<Email> emails = new ArrayList<>();
        while(resultSet.next()) {
            Email email = new Email();
            if(resultSet.getString("email.id") != null)
                email.setId(resultSet.getInt("email.id"));
            if(resultSet.getString("email.address") != null)
                email.setAddress(resultSet.getString("email.address"));
            emails.add(email);
        }
        return emails.toArray(new Email[emails.size()]);
    }

    public Other[] OtherSelection (ResultSet resultSet) throws SQLException {
        ArrayList<Other> others = new ArrayList<>();
        while(resultSet.next()) {
            Other other = new Other();
            if(resultSet.getString("other.city") != null)
                other.setId(resultSet.getInt("other.id"));
            if(resultSet.getString("other.name") != null)
                other.setName(resultSet.getString("other.name"));
            if(resultSet.getString("other.type") != null)
                other.setType(resultSet.getString("other.type"));
            if(resultSet.getString("other.data") != null)
                other.setData(resultSet.getString("other.data"));
            others.add(other);
        }
        return others.toArray(new Other[others.size()]);
    }

    public Person[] PersonSelection (ResultSet resultSet) throws SQLException {
        ArrayList<Person> persons = new ArrayList<>();
        while(resultSet.next()) {
            Person person = new Person();
            if(resultSet.getString("person.id") != null)
                person.setId(resultSet.getInt("person.id"));
            if (resultSet.getString("person.firstname") != null)
                person.setFirstname(resultSet.getString("person.firstname"));
            if(resultSet.getString("person.lastname") != null)
                person.setLastname(resultSet.getString("person.lastname"));
            persons.add(person);
        }
        return persons.toArray(new Person[persons.size()]);
    }

    public User[] UserSelection (ResultSet resultSet) throws SQLException {
        ArrayList<User> users = new ArrayList<>();
        while(resultSet.next()) {
            User user = new User();
            if(resultSet.getString("user.id") != null)
                user.setId(resultSet.getInt("user.id"));
            if(resultSet.getString("user.name") != null)
                user.setName(resultSet.getString("user.name"));
            if(resultSet.getString("user.password") != null)
                user.setPassword(resultSet.getString("user.password"));
            users.add(user);
        }
        return users.toArray(new User[users.size()]);
    }

    public Role[] RoleSelection (ResultSet resultSet) throws SQLException {
        ArrayList<Role> roles = new ArrayList<>();
        while(resultSet.next()) {
            Role role = new Role();
            if(resultSet.getString("role.id") != null)
                role.setId(resultSet.getInt("role.id"));
            if(resultSet.getString("role.role") != null)
                role.setRole(resultSet.getString("role.role"));
            roles.add(role);
        }
        return roles.toArray(new Role[roles.size()]);
    }

    public Section[] SectionSelection (ResultSet resultSet) throws SQLException {
        ArrayList<Section> sections = new ArrayList<>();
        while(resultSet.next()) {
            Section section = new Section();
            if(resultSet.getString("section.id") != null)
                section.setId(resultSet.getInt("section.id"));
            if(resultSet.getString("section.header") != null)
                section.setHeader(resultSet.getString("section.header"));
            if(resultSet.getString("section.section") != null)
                section.setBody(resultSet.getString("section.body"));
            if(resultSet.getInt("section.col") != 0)
                section.setCol(resultSet.getInt("section.col"));
            if(resultSet.getInt("section.row") != 0)
                section.setRow(resultSet.getInt("section.row"));
            sections.add(section);
        }
        return sections.toArray(new Section[sections.size()]);
    }

    public Page[] PageSelection (ResultSet resultSet) throws SQLException {
        ArrayList<Page> pages = new ArrayList<>();
        while(resultSet.next()) {
            Page page = new Page();
            if(resultSet.getString("page.id") != null)
                page.setId(resultSet.getInt("page.id"));
            if(resultSet.getInt("page.colAmount") != 0)
                page.setColAmount(resultSet.getInt("page.colAmount"));
            if(resultSet.getInt("page.rowAmount") != 0)
                page.setRowAmount(resultSet.getInt("page.rowAmount"));
            if(resultSet.getString("page.title") != null)
                page.setTitle(resultSet.getString("page.title"));
            if(resultSet.getString("page.css") != null)
                page.setCss(resultSet.getString("page.css"));
            pages.add(page);
        }
        return pages.toArray(new Page[pages.size()]);
    }

    public MenuItem[] MenuItemSelection (ResultSet resultSet) throws SQLException {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        while(resultSet.next()) {
            MenuItem menuItem = new MenuItem();
            if(resultSet.getString("menuitem.id") != null)
                menuItem.setId(resultSet.getInt("menuitem.id"));
            if(resultSet.getString("menuitem.title") != null)
                menuItem.setTitle(resultSet.getString("menuitem.title"));
            if(resultSet.getBoolean("menuitem.ischild") && resultSet.getInt("submenuitems.parrent") != 0)
                menuItem.setParrent(resultSet.getInt("submenuitems.parrent"));
            menuItems.add(menuItem);
        }
        return menuItems.toArray(new MenuItem[menuItems.size()]);
    }
}
