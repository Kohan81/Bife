package Lab5_Loops;


import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 16/10/2025
 * Program description:
 */
public class Average {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        //declare variables
        int num=0, temp=0;
        int average=0;
        //prompt user
        System.out.print("How many numbers you are going to enter: ");
        num=keyboard.nextInt();
        //loop
        for (int count=1; count<=num; count++ ){
            System.out.print("Enter number " + count + ": ");
            temp+=keyboard.nextInt();
            average=(temp/num);
        }//for
        System.out.println("Average: " + average);
    }//main

}//class
