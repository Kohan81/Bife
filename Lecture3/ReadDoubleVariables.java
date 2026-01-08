package Lecture3;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description: Inputting a Real Number
 * Suppose you want to read in and store the price of
 * an item e.g. 19.99?
 * Similar to previous:
 * ◦ Declare a variable of type double
 * ◦ Use nextDouble() to read the number from
 * the keyboard and store in the double variable
 */

public class ReadDoubleVariables {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Declare two double variables for price1 and price2
        double price1, price2;

        // ALWAYS prompt the user for a value first
        // then read from the keyboard

        System.out.print("Please enter a value for price 1: ");
        price1 = keyboard.nextDouble();

        System.out.print("Please enter a value for price 2: ");
        price2 = keyboard.nextDouble();

        System.out.println("The value entered for price 1 is " + price1);
        System.out.println("The value entered for price 2 is " + price2);
    }

}
