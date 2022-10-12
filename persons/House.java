package persons;

public class House {
    private String color = "ruzova"; //default pre vsetky
    private String address;
    private int floor;
    private Person owner;


    public House(String color, String address, int floor, Person owner) {
        //if(color == null) this.color = "ruzova";
        this.color = color;
        this.address = address;
        this.floor = floor;
        this.owner = owner;

    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }


    public void printHouseData(){
        System.out.println("The house has " + getColor() + " color, " + getFloor() + " floors. Is on " + getAddress() + " address." + " The owner of this house is " + getOwner());
    }
}
