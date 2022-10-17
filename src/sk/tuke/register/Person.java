package sk.tuke.register;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * register.Person.
 */
public class Person{
    /**
     * Name of this person.
     */
    private String name;

    /**
     * Phone number of this person.
     */
    private String phoneNumber;

    /**
     * Construct a person.
     *
     * @param name        name of the person
     * @param phoneNumber phone number of the person
     */
    public Person(String name, String phoneNumber)
                        throws WrongFormatException {
        this.name = name;
        this.setPhoneNumber(phoneNumber);
    }

    /**
     * Returns name of this person.
     *
     * @return name of this person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of this person.
     *
     * @param nameNew name of this person
     */
    public void setName(String nameNew) {
        name = nameNew;
    }

    /**
     * Returns phone number of this person.
     *
     * @return phone number of this person
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number of this person.
     *
     * @param phoneNumberNew phone number of this person
     */
    public void setPhoneNumber(String phoneNumberNew)
            throws WrongFormatException {

        if (!isValidPhoneNumber(phoneNumberNew)) {
            throw new WrongFormatException(
                    "The phone number is not valid.");
        }
        phoneNumber = phoneNumberNew;
    }


    /**
     * Validates the phone number. Valid phone numbers contains only digits.
     *
     * @param phoneNumber phone number to validate
     * @return <code>true</code> if phone number is valid, <code>false</code> otherwise
     */
    private boolean isValidPhoneNumber(String phoneNumber) {
//        char [] chars = phoneNumber.toCharArray();
        //test ci nie je null
        phoneNumber.trim();
        phoneNumber.replace(" ", "");

        if(phoneNumber.length() > 20) return false;
        if(phoneNumber.length() < 5) return false;

        //0904 //+421 904

        //regularny vyraz:
        Pattern p = Pattern.compile("\\+?\\d+");
        Matcher m = p.matcher(phoneNumber);
        return m.matches();

//        if (phoneNumber.length() == 10 || phoneNumber.length() == 14) {          //0904222333 = 10; 00421904333555= 14;
//            for (int i = 0; i < phoneNumber.length(); i++) {
//                if (!Character.isDigit(phoneNumber.charAt(i))) {
//                    return false;
//                }
//            }
//            return true;
//        }
//        return false;
    }


    /**
     * Returns a string representation of the person.
     *
     * @return string representation of the person.
     */
    public String toString() {
        return name + " (" + phoneNumber + ")";
    }



}
