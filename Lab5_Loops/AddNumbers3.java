package Lab5_Loops;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 06/11/2025
 * Program description:
 */
public class AddNumbers3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int number, total = 0;
        final int TERMINATOR = -999;

        System.out.println("Enter first number: ");
        number = keyboard.nextInt();
        while (number != TERMINATOR) {
            total+=number;
            System.out.print("Enter first number (or End program by inputting -999): ");
            number = keyboard.nextInt();
        }
        System.out.println("The total is " + total);
    }
}
