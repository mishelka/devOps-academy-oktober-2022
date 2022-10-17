package persons;

public class Main {
    public static final String DEFAULT_EMPLOYEE_ID = "1234";

    public static void main(String[] args) {
        var mother = new Person("Jana Vojcikova", 58, "Krompachy", "female");
        var father = new Person("Jan Vojcik", 60, "Krompachy", "male");
        Person janko = new Person("Janko Hrasko", 18, "Rozpravkove mesto");
        Person e1 = new Employee("Feri", 25, "Kosice", "male", "123457643r45");
        Employee e2 = new Employee("Peto", 22, "Kosice", "male", "78943hjdsyhf");
        Car car1 = new Car("red", 5, 5, "manual", "benzin", mother);
        Car car2 = new Car("blue", 3, 2, "automat", "gas", father);
//        Car car3 = new Car("yellow",5,5,"manual","gas","brother");
        House house1 = new House("brown", "Palarikova 12, Kosice, 04001", 1, mother);
        House house2 = new House("yellow", "Stara cesta 8, Krompachy, 05342", 2, father);
        House house3 = new House("green", "Maurerova 47, Kalava, 05002", 2, null);

        System.out.println(janko.equals(e1));
        System.out.println(janko.equals(new Person("Janko Hrasko", 18, "Kosice")));
        System.out.println(janko.getClass());

        //polymorphism
//        janko instanceof Person //true
//        janko instanceof Object //true
//        janko instanceof Employee //false
//        e1 instanceof Employee //true
//        e1 instanceof Person //true
//        e1 instanceof Object //true
//        janko instanceof String // false

        //pole domov
//        House[] houses = {
//                house1,
//                house2,
//                house3
//        };
//        House[] houses2 = new House[3];
//        printHouses(houses2);
//        houses2[0] = house1;
//        houses2[1] = house2;
//        houses2[2] = house3;
//        printHouses(houses2);

        Person[] persons = {
                janko,
                e1,
                e2
        };
        for (Person p :
                persons) {
//            System.out.println(p);
            System.out.println(p.getName());
        }


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

    private static void printHouses(House[] houses) {
        for (House house : houses) {
            //house.printHouseData();
            System.out.println(house);
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
