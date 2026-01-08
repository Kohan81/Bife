package Lecture3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class HolidayCost {
    public static void main(String[] args) {
        //declare the classes
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        //declare the variables
        int numOfPeople;
        double flightCost, transferCost, flightTotal, transferTotal, total;
        // TAX
        final double TAX=0.20;

        // prompt user to insert a value for each
        System.out.print(" Enter the number of people: ");
        numOfPeople = keyboard.nextInt();
        System.out.print(" Enter the cost of flight: €");
        flightCost = keyboard.nextDouble();
        System.out.print(" Enter the cost of transfer: €");
        transferCost=keyboard.nextDouble();
        // calculations
        flightTotal = numOfPeople*(flightCost*(1+TAX));
        transferTotal = numOfPeople*(transferCost*(1+TAX));
        total = flightTotal+transferTotal;
        //output the result
        System.out.println("\n--------------------------------------------");
        System.out.println("TAX: \t\t\t\t\t\t\t€" +TAX);
        System.out.println("Number of travelling people: \t" +numOfPeople);
        System.out.println("Total cost of flight: \t\t\t€" +df.format(flightTotal));
        System.out.println("Total cost of transfer: \t\t€" +df.format(transferTotal));
        System.out.println("--------------------------------------------");
        System.out.println("Total cost: \t\t\t\t\t€"+ df.format(total));
        System.out.println("--------------------------------------------");
    }
}
