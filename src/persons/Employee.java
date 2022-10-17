package persons;

public final class Employee extends Person {
    private String idCard;

    public Employee(String name, int age, String city,
                    String sex, String idCard) {
        super(name, age, city, sex);
        this.idCard = (idCard == null) ?
            Main.DEFAULT_EMPLOYEE_ID :
            idCard;
    }

    @Override
    public String toString() {
        return super.toString() + " employee ID: " + idCard;
    }
}
