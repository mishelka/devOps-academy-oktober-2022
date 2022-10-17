package sk.tuke.register;

import sk.tuke.register.ui.SwingUI;
import sk.tuke.register.ui.UserInterface;

public class Main {

    public static void main(String[] args) throws Exception {
        var register = new Register(20);

        register.addPerson(new Person("Janko Hrasko1", "0900123456"));

        register.addPerson(new Person("Janko Hrasko2", "0900123456"));
//        register.addPerson(new Person("Janko Hrasko3", "0900123456"));
//        register.addPerson(new Person("Janko Hrasko4", "0900123456"));
//        register.addPerson(new Person("Janko Hrasko5", "0900123456"));
//        register.addPerson(new Person("Janko Hrasko6", "0900123456"));

        UserInterface ui = new SwingUI();
                //new ConsoleUI(register);
        ui.run();
    }
}
