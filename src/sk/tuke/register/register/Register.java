package sk.tuke.register.register;

import sk.tuke.register.Person;

import java.util.List;

public interface Register {
    int getCount();

    Person getPerson(int index);

    void addPerson(Person person);

    Person findPersonByName(String name);

    Person findPersonByPhoneNumber(String phoneNumber);

//    /**
//     * Na zaklade zadaneho retazci v str najde
//     * vsetky osoby, ktore maju v mene alebo v telefonnom cisle
//     * tento retazec.
//     * --> nie equals, ale contains
//     * --> nie jedna podmienka vo filtri, ale dve
//     * @param str vstupny string pre vyhladavanie
//     * @return najdene osoby v liste
//     */
//    List<Person> findPersonByNameAndPhone(String str);

    void removePerson(Person person);

    List<Person> getPersons();
}
