package sk.tuke.register.register;

import sk.tuke.register.Person;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRegister implements Register {
    private List<Person> persons
            = new ArrayList<>();

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Person getPerson(int index) {
        return persons.get(index);
    }

    @Override
    public void addPerson(Person person) {
        if(persons.contains(person)) return;

        persons.add(person);

        persons.sort((p1, p2) ->
            p1.getName().compareTo(p2.getName()));
//        register.sort((p1, p2) -> {
//            int isName = p1.getName().compareTo(p2.getName());
//            if (isName != 0) return isName;
//            return p1.getPhoneNumber().compareTo(p2.getPhoneNumber());
//        });
//        register.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                int isName = p1.getName().compareTo(p2.getName());
//                if (isName != 0) return isName;
//                return p1.getPhoneNumber().compareTo(p2.getPhoneNumber());
//            }
//        });
        print();
    }

    @Override
    public Person findPersonByName(String name) {
        List<Person> filtered = persons.stream()
                .filter(p -> p.getName().equals(name))
                .toList();
        if(filtered.size() == 0) return null;
        return filtered.get(0);
    }

    @Override
    public Person findPersonByPhoneNumber(String phoneNumber) {
        List<Person> filtered = persons.stream()
                .filter(p -> p.getPhoneNumber().equals(phoneNumber))
                .toList();
        if(filtered.size() == 0) return null;
        return filtered.get(0);
    }

    @Override
    public void removePerson(Person person) {
        //fori
//        for (int i = 0; i < register.size(); i++) {
//            if(register.get(i).equals(person)) {
//                register.remove(i);
//                break;
//            }
//        }
        int index = persons.indexOf(person);
        if(index != -1) persons.remove(index);
    }

    @Override
    public List<Person> getPersons() {
        return persons;
    }

    public void print() {
        persons.stream()
                .forEach(p -> System.out.printf("%s - %s",
                        p.getName(), p.getPhoneNumber()));
    }
}
