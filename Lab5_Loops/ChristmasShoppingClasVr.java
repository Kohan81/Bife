package Lab5_Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eugene
 * create on 13/11/2025
 * Program description:
 */
public class ChristmasShoppingClasVr {
    public static void main(String[] args) {

        //Scanner
        Scanner keyboard = new Scanner(System.in);
        //df format
        DecimalFormat df = new DecimalFormat("00.00");
        // output welcome mess
        System.out.println("Christmas Shop Planner");
        System.out.println("=======================");
        // declare variables - final for exit
        final int EXIT = 2;
        String itemName, largestItemName = "";
        double prices = 0, largestPrice = 0;
        System.out.println("Add item ? PRESS (1) yes OR (2) no \" (1) yes OR (2) no  ");
        int choice = keyboard.nextInt();


        while (choice != EXIT) {
            System.out.print("Enter item name: ");
            itemName = keyboard.next();
            // giftName(consider how to add the name of the gift)
            System.out.print("Enter the item price: ");
            prices = keyboard.nextDouble(); // read in from user


            if (prices>largestPrice) {
                largestPrice = prices;
                largestItemName = itemName;
            }//if

            System.out.println("Add another item ? PRESS (1) yes OR (2) no ");
            choice = keyboard.nextInt();
        }//while
        System.out.println("\nThe most expensive item is: " + largestItemName + " €"+largestPrice);

    }//while
}
