package Lab5_Loops;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Eugene
 * create on 13/11/2025
 * Program description:
 */
public class LargestNumber {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        final int EXIT =-999;
        int number, largest;
        // prompt user
        System.out.print("Enter the first number: ");
        number=keyboard.nextInt(); // read in from user
        largest=number;
        //System.out.println("Print  number: " + number);
        //System.out.println("Print largest number: "+ largest);

        while(number!= EXIT){// if the user had press -999  program goes on
            if(number>largest){
                largest=number;
            }//if
            System.out.print("Enter a number (or -999 to EXIT): ");//looping and changing largest number
            number=keyboard.nextInt(); // read in from user

        }//while

        System.out.println("\nThe largest number is : " + largest);
    }//main

}
