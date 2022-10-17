package register.ui;

import sk.tuke.register.Person;
import sk.tuke.register.Register;
import sk.tuke.register.WrongFormatException;

import java.util.Scanner;

/**
 * User interface of the application.
 */
public class ConsoleUI implements UserInterface {
    /**
     * register.Register of persons.
     */
    private Register register;

    /**
     * scanner
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Menu options.
     */
    public enum Option {
        PRINT, ADD, UPDATE, REMOVE, FIND, EXIT
    }

    public ConsoleUI(Register register) {
        this.register = register;
    }

    public void run() {
        while (true) {
            switch (showMenu()) {
                case PRINT:
                    printRegister();
                    break;
                case ADD:
                    addToRegister();
                    break;
                case UPDATE:
                    updateRegister();
                    break;
                case REMOVE:
                    removeFromRegister();
                    break;
                case FIND:
                    findInRegister();
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private String readLine() {
        return scanner.nextLine();
    }

    private Option showMenu() {
        System.out.println("Menu.");
        for (var option : Option.values()) {
            System.out.printf("%d. %s%n", option.ordinal() + 1, option);
        }
        System.out.println("-----------------------------------------------");

        var selection = -1;
        do {
            System.out.println("Option: ");

            try {
                selection = Integer.parseInt(readLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong selection!");
            }
        } while ((selection <= 0 || selection > Option.values().length));

        return Option.values()[selection - 1];
    }


    private void printRegister() {
        for (int i = 0; i < register.getCount(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(register.getPerson(i));
        }
    }

    private void addToRegister() {
        System.out.println("Enter Name: ");
        var name = readLine();
        System.out.println("Enter Phone Number: ");
        var phoneNumber = readLine();

        Person p = null;
        try {
            p = new Person(name, phoneNumber);
        } catch (WrongFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Try again.");
        }

        if(p != null) {
            for (int i = 0; i < register.getSize(); i++) {
                if ((register.getPerson(i).getName().equals(p.getName())) || (register.getPerson(i).getName().equals(p.getPhoneNumber()))) {
                    System.out.println("User name or phone number already exist!");
                    break;
                } else if ((!register.getPerson(i).getName().equals(p.getName())) || (!register.getPerson(i).getName().equals(p.getPhoneNumber()))) {
                    register.addPerson(p);
                    break;
                }
            }
        }
    }


    private void updateRegister() {
        Scanner scanner = new Scanner(System.in);
        boolean temp = true;
        int number;
        int option;
        do {
            System.out.print("Enter the number of person you want to update: ");

            try {
                number = scanner.nextInt();
                Person p = register.getPerson(number - 1);
                if (number <= register.getCount()) {
                    System.out.println("Old data: " + p);
                    System.out.println("Do you want to change the name? Press 1");
                    System.out.println("Do you want to change the phone number? Press 2");
                    System.out.println("Do you want to change the name and the phone number? Press 3");
                    System.out.println("Press 4 for exit ...");
                }

                try {
                    option = scanner.nextInt();

                    switch (option) {
                        case 1:
                            System.out.print("Enter new name: ");
                            var newName = readLine();
                            p.setName(newName);
                            break;
                        case 2:
                            System.out.print("Enter new phone number: ");
                            var newPhoneNumber = readLine();
                            p.setPhoneNumber(newPhoneNumber);
                            break;
                        case 3:
                            System.out.println("Enter new data: ");
                            System.out.print("New name: ");
                            p.setName(readLine());
                            System.out.print("New number: ");
                            p.setPhoneNumber(readLine());
                            break;
                        case 4:
                            System.out.println("Wrong number!");
                            break;
                        default:
                            temp = false;
                            break;
                    }
                } catch (Exception exception) {
                    System.out.println("This is not a number!");
                    scanner.next();
                }
            } catch (Exception ex) {
                System.out.println("This is not a number!");
                scanner.next();
            }

        } while (!temp);
    }


    private void findInRegister() {
        boolean temp = true;
        do {
            System.out.println("Press 1 to find the person by name");
            System.out.println("Press 2 to find the person by phone number");
            System.out.println("Press 3 for exit");
            var option = Integer.parseInt(readLine());

            switch (option) {
                case 1:
                    try {
                        System.out.println("Enter the first name and the last name:");
                        var name = readLine();
                        System.out.println(register.findPersonByName(name));

                    } catch (NullPointerException e) {
                        System.out.println("Wrong name!");
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Enter the phone number in format 090xxxxxxx , or 0042x9xxxxx");
                        var number = readLine();
                        System.out.println(register.findPersonByPhoneNumber(number));
                        break;

                    } catch (NullPointerException e) {
                        System.out.println("Wrong number!");
                    }
                    break;

                case 3:
                    showMenu();
                    break;

                default:
                    temp = false;
                    break;
            }
        } while (!temp);
    }

    private void removeFromRegister() {
        System.out.println("Enter index: ");
        var index = Integer.parseInt(readLine());
        var person = register.getPerson(index - 1);
        register.removePerson(person);
    }
}