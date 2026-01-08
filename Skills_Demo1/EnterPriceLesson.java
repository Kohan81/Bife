package Skills_Demo1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Create by Eugene
 * create on 20.10.2025
 * Program description
 */
public class EnterPriceLesson {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name;
        double price, average, total = 0;
        int items;

        DecimalFormat df = new DecimalFormat("00.00");

        //prompt user - number of items
        System.out.print("ENTER NUMBER OF ITEMS:");
        items = keyboard.nextInt();
        for (int loop = 0; loop < items; loop++) {

            //prompt for name price
            System.out.print("ENTER NAME OF ITEM " + (loop + 1) + " : ");
            name = keyboard.next();
            System.out.print("ENTER PRICE OF " + name.toUpperCase() + " € ");
            price = keyboard.nextDouble();
            System.out.println("_________________________________");

            //calculate the average price
            total += price;

        }//for
        average = total / items;
        System.out.println("_________________________________");
        System.out.println("TOTAL = €" + df.format(total));
        System.out.println("AVERAGE =  €" + df.format(average));
    }

}//class
