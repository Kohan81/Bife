package Lab5_Loops;


import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by: Fedir
 * Created on: 16/10/2025
 * Program description:
 */
public class Divisor {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(in);

        int start, finish, divisor;
        //prompt user to enter the values
        System.out.print("Enter value for the start: ");
        start=keyboard.nextInt();
        System.out.print("Enter value for the finish: ");
        finish=keyboard.nextInt();
        System.out.print("Enter value for the divisor: ");
        divisor=keyboard.nextInt();
        //loop
        System.out.println("output:\t" + start);
        for (int i = start+divisor; i <= finish; i += divisor){
            System.out.println("\t\t" + i);
        }
    }//main

}//class
