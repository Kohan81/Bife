package people;

/**
 * Created by Eugene
 * create on 17/11/2025
 * Program description:
 */
public class Person {

    private String name;
    private boolean hair;
    private int age;
    private String ppsn;
    private String phoneNumber;

   //constructor
    public Person() {
        System.out.println("I am an empty object");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("I am an object with name " + name);
    }
    public Person(String name, boolean hair, int age, String ppsn, String phoneNumber) {
        this.name = name;
        this.hair = hair;
        this.age = age;
        this.ppsn = ppsn;
        this.phoneNumber = phoneNumber;
    }

    //very bad design!!!
    public Person(String name, boolean hair, String ppsn, String phoneNumber, int age) {
        this.name = name;
        this.hair = hair;
        this.age = age;
        this.ppsn = ppsn;
        this.phoneNumber = phoneNumber;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isHair() {
        return hair;
    }
    //methods
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    @Override
    public String toString() {
        if (name == null) {
            return "No name";
        } else if (ppsn == null){
            return name;
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", hair=" + hair +
                ", age=" + age +
                ", ppsn='" + ppsn + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
