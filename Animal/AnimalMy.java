package Animal;

/**
 * Created by Eugene
 * create on 17/11/2025
 * Program description:
 */
public class AnimalMy {

    //attributes
    private String name;
    private int age;
    private String color;

    //constructor
    public AnimalMy() {}

    public AnimalMy(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    //getter and setter

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
