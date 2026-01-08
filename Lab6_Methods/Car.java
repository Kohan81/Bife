package Lab6_Methods;

/**
 * Created by Eugene
 * create on 20/11/2025
 * Program description:
 */
public class Car {

    private int id;
    private String make;
    private String ownerName;
    private String colour;
    private int year;
    private int topSpeed;
    private double costPrice;

    private static int count = 0;

    public Car(int i, String audi, String carsSalon, String silver, int i1, double v) {}// default constructor

    // alternative constructor with all parameters
    public Car(int id, String make, String ownerName, String colour, int year, int topSpeed, double costPrice) {
        this.id = id;
        this.make = make;
        this.ownerName = ownerName;
        this.colour = colour;
        this.year = year;
        this.topSpeed = topSpeed;
        this.costPrice = costPrice;

        count++;
    }

    // alternative constructor with 4 parameters
    public Car(int id, String make ,String ownerName, String colour){
        this.id = id;
        this.make = make;
        this.ownerName = ownerName;
        this.colour = colour;

        count++;
    }

    // alternative constructor with 3 parameters
    public Car(int id, int topSpeed, String make) {
        this.id = id;
        this.topSpeed = topSpeed;
        this.make = make;

        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "\nid=" + id +
                ", \nmake='" + make + '\'' +
                ", \nownerName='" + ownerName + '\'' +
                ", \ncolour='" + colour + '\'' +
                ", \nyear=" + year +
                ", \ntopSpeed=" + topSpeed +
                ", \ncostPrice=" + costPrice +
                ", \ncount=" + count +
                '}';
    }

    public void printCarDetails(){
        System.out.println(toString());
    }

    public static int numberOfCars(){
        return count;
    }
}
