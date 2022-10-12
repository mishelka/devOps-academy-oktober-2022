package persons;

public class Person {

    private String name;
    private int age;
    private String city;
    private String sex;

    private Person mother;
    private Person father;

    public Person(String name, int age, String city, String sex) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.sex = sex;
    }

    public Person(String name, int age, String city) {
        this(name, age, city, "female");
    }

    public Person(String name, String city, String sex) {
        this(name, 18, city, sex);
    }



    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void printData(){
        System.out.println("Data of " + getSex() + " person");
        printName();
        printAge();
        printCity();
        System.out.println();
    }

    public void printName(){
        System.out.println("Name: " + getName());
    }

    public void printAge(){
        System.out.println("Age: " + getAge());
    }

    public void printCity(){
        System.out.println("City: " + getCity());
    }

    @Override
    public String toString() {
//        String m = "";
//        if(this.mother != null) {
//             m = this.mother.toString();
//        }
        return "Person{" +
                "name='" + name + '\'' +
                (mother != null ? ", mother: " + mother : "") +
                (father != null ? ", father: " +  father : "") +
                '}';

        //car - ak ma ownera, vypisat jeho meno,
        // ak nie vypisat "for sale")
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Person)) return false;
        Person p =  (Person) obj;

        //if(!(obj instanceof Person p)) return false;

        return this.name.equals(p.name)
                && this.age == p.age;
//        return super.equals(obj);
    }
}
