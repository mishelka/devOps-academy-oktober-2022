package persons;

public class Car {
    private String color;
    private int numberOfDoors;
    private int numberOfSeats;
    private String typeOfGearbox;
    private String typeOfFuel;
    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Car(String color, int numberOfDoors, int numberOfSeats, String typeOfGearbox, String typeOfFuel, Person owner) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.typeOfGearbox = typeOfGearbox;
        this.typeOfFuel = typeOfFuel;
        this.owner = owner;
    }

    public Car(String color, String typeOfGearbox, String typeOfFuel) {
        this.color = color;
        this.typeOfGearbox = typeOfGearbox;
        this.typeOfFuel = typeOfFuel;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeOfGearbox() {
        return typeOfGearbox;
    }

    public void setTypeOfGearbox(String typeOfGearbox) {
        this.typeOfGearbox = typeOfGearbox;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;

    }

    public void printCar() {
        System.out.println("The car has " + getColor() + " color," + getNumberOfDoors() +
                " doors" + " with " + getNumberOfSeats() + " seats." +
                " Type of gearbox is " + getTypeOfGearbox() + " and fuel: " + getTypeOfFuel() + ". The owner of this car is " + getOwner());
//        System.out.println("and i want to sell it to");

    }

    public void sellTo(Person owner){
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                (owner != null ? ", owner=" + owner.getName() : ", for sale") +
                '}';
    }
}
