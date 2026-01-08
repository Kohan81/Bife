package PeopleSkillDemo;

/**
 * Created by Eugene
 * create on 20/11/2025
 * Program description:
 */
public class Person {
    private String name;
    private int age;
    private String id;
    private String phoneNumber;
    private int heigh;

    Person(){};
    Person(String name, int age, String id, String phoneNumber, int heigh){
        this.name=name;
        this.age=age;
        this.id=id;
        this.phoneNumber=phoneNumber;
        this.heigh=heigh;
    }

    Person(String name, int age, String phoneNumber){
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", heigh=" + heigh +
                '}';
    }

    public void printPersonDetails(){
        System.out.println(toString());
    }
}
