package sk.tuke.register;

import sk.tuke.register.register.ArrayListRegister;
import sk.tuke.register.register.ArrayRegister;
import sk.tuke.register.register.Register;
import sk.tuke.register.ui.ConsoleUI;
import sk.tuke.register.ui.UserInterface;

public class Main {

    public static void main(String[] args) throws Exception {
        Register register = new ArrayListRegister();

        register.addPerson(new Person("Jan", "0900123456"));
        register.addPerson(new Person("Anna", "0900123456"));
        register.addPerson(new Person("Peter", "0900123456"));
        register.addPerson(new Person("Xenia", "0900123456"));
        register.addPerson(new Person("Cyril", "0900123456"));
        register.addPerson(new Person("Bozena", "124567"));
        register.addPerson(new Person("Bozena", "0900123456"));

        UserInterface ui = new ConsoleUI(register);
                //new SwingUI(register);
        ui.run();
    }
}
