package persons;

public class Main {
    public static void main(String[] args) {

        var mother = new Person("Jana Vojcikova", 58, "Krompachy", "female");
        var father = new Person("Jan Vojcik", 60, "Krompachy", "male");
        Person janko = new Person("Janko Hrasko", 18, "Rozpravkove mesto");
        Car car1 = new Car("red", 5, 5, "manual", "benzin", mother);
        Car car2 = new Car("blue", 3, 2, "automat", "gas", father);
//        Car car3 = new Car("yellow",5,5,"manual","gas","brother");
        House house1 = new House("brown", "Palarikova 12, Kosice, 04001", 1, mother);
        House house2 = new House("yellow", "Stara cesta 8, Krompachy, 05342", 2, father);
        House house3 = new House("green", "Maurerova 47, Kalava,05002", 2, null);

        //janko.setMother(mother);
        janko.setFather(father);
//        janko.getFather().setFather(..);
//        janko.getFather().setMother(..);

        Person m = janko.getMother();
        if (m != null) {
            m.getName();
        }
        //DRY - dont repeat yourself

//        System.out.println(house1.getOwner().getName());
//
//        car1.printCar();
//        System.out.println(car1);
//
//        car1.sellTo(father);
//        car1.printCar();
//
//        System.out.println(car1);

        System.out.println(janko.toString());


//        mother.printData();
//        father.printData();

//        Person [] parents = {mother,father};
//        printArrayPerson(parents);
//        Car[] cars = {car1, car2};
//        printCarData(cars);
//        House[] houses = {house1, house2, house3};
//        houseData(houses);

    }

    private static void houseData(House[] houses) {
        for (House house : houses) {
            house.printHouseData();
        }
    }

    private static void printCarData(Car[] cars) {
        for (Car car : cars) {
            car.printCar();

        }
    }

    private static void printArrayPerson(Person[] parents) {
        for (Person parent : parents) {
            parent.printData();

        }
    }
}
