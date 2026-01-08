package zoo;

/**
 * Created by Eugene
 * create on 20/11/2025
 * Program description:
 */
public class testZOO {
    public static void main(String[] args) {

        AnimalType a1 = new AnimalType();

        AnimalType a2 = new AnimalType("wolf", "meat", 3, true, 59.7);

        AnimalType a3 = new AnimalType("dog", 2.3, true );

        a1.printAnimalType();
        a2.printAnimalType();
        a3.printAnimalType();

        a3.setType("wolf");
        a3.setSex(false);
        a3.setWeight(10.7);
        a3.setAge(2);
        a3.setFood("meat");

        a3.printAnimalType();
    }
}
