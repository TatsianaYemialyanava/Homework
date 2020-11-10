package by.it.yemialyanava.person.jd02_10;

import java.util.List;

//@XmlRootElement()
public class Persons {

  //  @XmlElement(name = "person")
    private List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> list) {
        this.persons = list;
    }
}
