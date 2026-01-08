package Cars;

/**
 * Created by Eugene
 * create on 13/11/2025
 * Program description:
 */
public class Car {

    //attributes - instance variables
    //constructor
    //getter and setter
    //methods

    //declared 4 instance variables/attributes that belong to a car
    private String color;
    private String regNumber;
    private String name;
    private int year;
    private int nuDoors;
    private int speed;

    public Car() {
        System.out.println("I am a default constructor");
    }


    public Car(String reg) {
        regNumber = reg;
        System.out.println("Car REG: " + reg);
    }

    public Car(String color, String regNumber, String name, int year, int nuDoors, int speed) {
        this.color = color;
        this.regNumber = regNumber;
        this.name = name;
        this.year = year;
        this.nuDoors = nuDoors;
        this.speed = speed;
        System.out.println("I am an alternate constructor");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNuDoors() {
        return nuDoors;
    }

    public void setNuDoors(int nuDoors) {
        this.nuDoors = nuDoors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        if (color == null || regNumber == null || name == null || year == 0 || nuDoors == 0 || speed == 0) {
            return "Car has no any information ";
        }
        return "Car { " +
                "color='" + color + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", nuDoors=" + nuDoors +
                ", speed=" + speed +
                '}';
    }
}
/*
public Car(String itsColour, String reg,int doorNum, boolean airCondition){
   regNumber = reg;
   colour= itsColour;
   noDoors =doorNum;
   airCon = airCondition;
   System.out.println("CAR REG : " + reg);
    System.out.println("CAR COLOUR : " + itsColour);
    System.out.println("CAR DOORS : " + doorNum);
    System.out.println("CAR AIR CON : " + airCondition);
}//Alternative constructor
 */