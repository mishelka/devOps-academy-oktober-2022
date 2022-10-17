package sk.tuke.register;

import java.util.Arrays;

/**
 * register.Person register.
 */
public class Register {
    /**
     * register.Person array.
     */
    private Person[] persons;

    /**
     * Number of persons in this register.
     */
    private int count;

    /**
     * Constructor creates an empty register with maximum size specified.
     *
     * @param size maximum size of the register
     */
    public Register(int size) {
        persons = new Person[size];
        count = 0;
    }

    /**
     * Returns the number of persons in this register.
     *
     * @return the number of persons in this register
     */
    public int getCount() {
        return count;
    }

    /**
     * Returns the maximum number of persons in this register.
     *
     * @return the maximum number of persons in this register.
     */
    public int getSize() {
        return persons.length;
    }

    /**
     * Returns the person at the specified position in this register.
     *
     * @param index index of the person to return
     * @return person the person at the specified position in this register
     */
    public Person getPerson(int index) {
        return persons[index];
    }

    public Register(Person[] persons) {
        this.persons = persons;
    }

    /**
     * Appends the specified person to the end of this register.
     *
     * @param person person to append to this register
     */
    //prejdem cele pole, ak najdem rovnaku osobu, vyhodim novu vynimku DuplicateEntityException
    //vytvorim triedu pre vynimku
    //pridam throws do signatury metody
    //v tele metody, ak nie je osoba unikatna, vyhodim novu vynimku (throw new ...)
    //potom odchytim vynimku v ConsoleUI (aj v Main!) - vsade, kde pridavam novu osobu
    public void addPerson(Person person) {
        persons[count] = person;
        if(count > 1) {
            Arrays.sort(persons, 0, count);
        }
        count++;
    }


    /**
     * Returns the person with specified name in this register or <code>null</code>,
     * if match can not be found.
     *
     * @param name name of a person to search for
     * @return person with specified phone number
     */
    public Person findPersonByName(String name) {
        for (int i = 0; i < getCount(); i++) {
            if (getPerson(i).getName().equals(name)) {
                return getPerson(i);
            }
        }
        return null;
    }


    /**
     * Returns the person with specified phone number in this register or <code>null</code>,
     * if match can not be found.
     *
     * @param phoneNumber phone number of a person to search for
     * @return person with specified phone number
     */
    public Person findPersonByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < getCount(); i++) {
            if (getPerson(i).getPhoneNumber().equals(phoneNumber)) {
                return getPerson(i);
            }
        }
        return null;
    }


    /**
     * Removes the specified person from the register.
     *
     * @param person person to remove
     */
    public void removePerson(Person person) {
        for (int i = 0; i < count; i++) {
            if (person.equals(persons[i])) {
                for (int j = i; j < count; j++) {
                    persons[j] = persons[j + 1];
                }
            }
        }
        count--;
    }
}
