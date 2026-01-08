package zoo;

/**
 * Created by Eugene
 * create on 20/11/2025
 * Program description:
 */
public class AnimalType {

    private String food;
    private String type;
    private int age;
    private boolean sex;
    private double weight;

    //default constructor
    AnimalType(){};

    //all attributes constructor
    public AnimalType(String type, String food, int age, boolean sex, double weight) {
        this.type = type;
        this.food = food;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public AnimalType(String type, double weight, boolean sex){
        this.type = type;
        this.weight = weight;
        this.sex = sex;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "AnimalType{" +
                " type ='" + type + '\'' +
                ", food ='" + food + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", weight=" + weight +
                '}';
    }

    public void printAnimalType(){
        System.out.println(toString());
    }
}

