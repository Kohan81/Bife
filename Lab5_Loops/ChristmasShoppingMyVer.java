package Lab5_Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eugene
 * create on 13/11/2025
 * Program description:
 */
public class ChristmasShoppingMyVer {
    public static void main(String[] args) {

        //Scanner
        //df format
        // output welcome mess
        // declare variables - final for exit

        // prices, largest price
        // giftName(consider how to add the name of the gift)
        //while
        //if
        //output larget item and price

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //final int EXIT = -1;

        boolean exit = true;
        int price = 0;
        int largestPrice = 0;
        String giftName = "";
        String largestGift = "";

        System.out.println("Welcome to the Christmas Shopping Wish List!");

        while (exit) {

            System.out.print("Please enter the name of present: ");
            giftName = keyboard.next();

            System.out.print("Please enter the price of it:  ");
            price = keyboard.nextInt();
            System.out.println();

            System.out.println("You add a gift to your wish list:");
            System.out.println("your gift is a " + giftName + " and costs " + df.format(price) + ".");
            System.out.println("--------------------------------------");
            if (price > largestPrice) {
                largestGift = giftName;
                largestPrice = price;
            }
            System.out.println("Do you want to add another gift? (y/n)");
            String response = keyboard.next();
            if (response.charAt(0) == 'n') {
                exit = false;
            }
        }
        System.out.println("The largest gift is " + largestGift + " and costs " + df.format(largestPrice) + ".");
    }
}
