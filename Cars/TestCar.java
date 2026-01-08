package Cars;

/**
 * Created by Eugene
 * create on 13/11/2025
 * Program description:
 */
public class TestCar {
    public static void main(String[] args) {

        Car myCar = new Car();
        Car newCar = new Car("Black", "22Dxxxx", "Audi A6", 2022, 5, 220);

        System.out.println(myCar);
        System.out.println(newCar);

        myCar.setColor("Gold");
        myCar.setName("Dacia");
        myCar.setRegNumber("151wx1609");
        myCar.setNuDoors(5);
        myCar.setSpeed(180);
        myCar.setYear(2015);

        System.out.println(myCar);
    }
}
