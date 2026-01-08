package Lab2;

/**
 * Create by Eugene
 * create on 20.10.2025
 * Program description
 */
public class SwapNumbers {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        System.out.println("There are:\t a = " + a + ", b = " + b);

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("Now there are:\t a = " + a + ", b = " + b);
    }

}//class
