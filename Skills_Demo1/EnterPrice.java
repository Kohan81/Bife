package Skills_Demo1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Create by Eugene
 * create on 20.10.2025
 * Program description  /*EnterPrice prompt user for a number of items, read in the number and store in a variable call Items.
 *     The program will them ask the user for name and the price of each item.
 *     then calculate how much the total cost is and the average price on all items.
 *     out information of total and average To do list
 *     */

//To do list
//Create a class called item
// Import Scanner
// import Decimal format
// prompt user - number of items / name

// for (int loop = 0; loop< itemNumber ; loop++) { - prompt for name price - add total+=price }
// calculate the average price
// output result

public class EnterPrice {
    public static void main(String[] args) {
        //Create a class called item

        int items;
        double totalPrice = 0, averagePrice;


        // Import Scanner
        Scanner keyboard = new Scanner(System.in);
        // import Decimal format
        DecimalFormat df = new DecimalFormat("0.00");
        // prompt user - number of items / name

        System.out.print("Enter the " + " count of items: ".toUpperCase());
        items = keyboard.nextInt();

        double itemsPrices[] = new double[items];
        String itemsNames[] = new String[items];

        // for (int loop = 0; loop< itemNumber ; loop++) { - prompt for name price - add total+=price }

        for (int i = 0; i < items; i++) {

            System.out.print("Enter the " + "name".toUpperCase() + " of the item " + (i + 1) + ": ");
            itemsNames[i] = keyboard.next();

            System.out.print("Enter the " + "price".toUpperCase() + " of the " + itemsNames[i] + ": ");
            itemsPrices[i] = keyboard.nextDouble();

        }

        System.out.println();

        System.out.println("Your items are: " );
        System.out.println();

        for(int i = 0; i < items; i++) {
            System.out.println(itemsNames[i] + ": " + df.format(itemsPrices[i]));
            totalPrice+=itemsPrices[i];
        }

        System.out.println();

        // calculate the average price
        // output result
        System.out.println("Your Total Price: " + df.format(totalPrice));
        System.out.println("Your Average Price is " + df.format(totalPrice/items));
    }
}//class
