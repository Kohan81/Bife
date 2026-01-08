package Lab6_Methods;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Eugene
 * create on 10/11/2025
 * Program description:
 */
public class Donation {
    public static void main(String[] args) {
        //declare scanner and decimal format
        Scanner keyboard = new Scanner(in);
        DecimalFormat df = new DecimalFormat("€0.00");
        //declare variables
        int nuOfDonations = 0;
        double largestDonateNum = 0;
        double total = 0;
        double donate = 0;
        String largestDonateName = "";
        String name;
        final double TARGET = 500;
        do{
            System.out.print("Please enter your name: ");
            //name = JOptionPane.showInputDialog("Hello we have to collect " + (TARGET - total) +" € Please enter your name: ");
            name = keyboard.nextLine();
//            JOptionPane.showMessageDialog(null, "Hello, " + name +
//                    " we have to collect " + (TARGET - total) + " €");
            System.out.println("Hello, " + name);
            System.out.println("we have to collect " + (TARGET - total) + " €");
            System.out.println();
            if (name != ""){
                nuOfDonations++;
                donate = Double.parseDouble(JOptionPane.showInputDialog("Enter your donation please\t:€"));
//                JOptionPane.showMessageDialog(null, "Thank you " + name + " for your donation in "
//                + df.format(donate));
                System.out.println("Enter your donation please\t:€");
                donate = keyboard.nextDouble();
                if (donate>largestDonateNum){
                    largestDonateNum = donate;
                    largestDonateName = name;
                    total += donate;
                }
            }
        }while(total <= TARGET);
//        JOptionPane.showMessageDialog(null, "we collect " + df.format(total) + " €");
//        //System.out.println("we collect " + df.format(total) + " €");
//        JOptionPane.showMessageDialog(null, "The largest donar is " + largestDonateName +
//                " donated " + df.format(largestDonateNum));
        System.out.println("The largest donar is " + largestDonateName +
                 " donated " + df.format(largestDonateNum));
    }//main
}//class