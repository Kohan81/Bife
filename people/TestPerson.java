package people;

/**
 * Created by Eugene
 * create on 17/11/2025
 * Program description:
 */
public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Eugene", true, "tr424252", "0851953717", 44);
        Person p3 = new Person("Ciara");
        System.out.println( p3);
        System.out.println( p2);
        System.out.println( p1);
    }
}
