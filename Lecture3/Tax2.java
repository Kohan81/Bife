package Lecture3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class Tax2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        //declare the variables
        double cost,taxRate;;
        //prompt user to enter a value for the variables
        System.out.print("Enter a value for the cost: €");
        cost=keyboard.nextDouble();
        System.out.print("Enter a value for the taxRate: €");
        taxRate=keyboard.nextDouble();
        //variable to store the amount payable
        double taxPayable;
        //calculate tax payable
        taxPayable=(int)((cost*taxRate)*100)/100.0;
        //output of tex payable
        //System.out.println("Tax Payable:\t$" + df.format(taxPayable));
        System.out.println("Tax Payable:\t€" + taxPayable);
    }
}
