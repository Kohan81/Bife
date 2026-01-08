package Lab3;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class HolidayCost {

    //declare the variables
    static int numOfPeople;
    static double flightCost, transferCost, flightTotal, transferTotal, total;
    static String answer;
    // TAX
    final static double TAX = 0.20;

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        answer = JOptionPane.showInputDialog("Do you want to enter values? Please " +
                "enter yes or no");

        if (answer == "yes") {

            answer = JOptionPane.showInputDialog("Enter the number of people: ");
            numOfPeople = Integer.parseInt(answer);

            answer = JOptionPane.showInputDialog(" Enter the cost of flight: €");
            flightCost = Double.parseDouble(answer);

            answer = JOptionPane.showInputDialog(" Enter the cost of transfer: €");
            transferCost = Double.parseDouble(answer);

            calcatons(numOfPeople, flightCost, transferCost);

            JOptionPane.showMessageDialog(null, "TAX: \t\t\t\t\t\t\t€" +TAX);
            JOptionPane.showMessageDialog(null, "Number of travelling people: \t" +numOfPeople);
            JOptionPane.showMessageDialog(null, "Total cost of flight: \t\t\t€" +df.format(flightTotal));
            JOptionPane.showMessageDialog(null, "Total cost of transfer: \t\t€" +df.format(transferTotal));
            JOptionPane.showMessageDialog(null, "Total cost: \t\t\t\t\t€"+ df.format(total));

        } else {

        }


        //declare the class


        // prompt user to insert a value for each

    }

    static void calcatons(int numOfPeople, double flightCost, double transferCost) {

        flightTotal = numOfPeople * (flightCost * (1 + TAX));
        transferTotal = numOfPeople * (transferCost * (1 + TAX));
        total = flightTotal + transferTotal;
//        int numOfPeople1 = 6;
//        int numOfPeople2 = 2;
//        int numOfPeople3 = 10;
//
//        double flightCost1 = 200;
//        double flightCost2 = 250;
//        double flightCost3 = 445;
//
//        double transferCost1 = 30;
//        double transferCost2 = 0;
//        double transferCost3 = 25;
    }
}
