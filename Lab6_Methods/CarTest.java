package Lab6_Methods;

/**
 * Created by Eugene
 * create on 20/11/2025
 * Program description:
 */
public class CarTest {
    public static void main(String[] args) {

        Car myCar = new Car(442877, "180", "Eugene", "gold");
        System.out.println(myCar);

        Car newCar = new Car(52236236, "Audi" , "cars salon",
                "Silver", 2025 ,220, 55_000.00);
        System.out.println(newCar);

        myCar.printCarDetails();

        System.out.println("Number of cars is = " + Car.numberOfCars());

    }
}
