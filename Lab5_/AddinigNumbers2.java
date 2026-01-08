package Lab5_;

import java.util.Scanner;

/**
 * Create by Eugene
 * create on 16.10.2025
 * Program description
 */
public class AddinigNumbers2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number, total = 0;
        final int HOWMANY = 3;

        for (int count = 0; count < HOWMANY; count++) {
            System.out.print("Enter number\t\t\t\t: ");
            number = keyboard.nextInt();
            total += number;
        }
        System.out.println("The total of all numbers is \t: " + total);
    }

}//class
