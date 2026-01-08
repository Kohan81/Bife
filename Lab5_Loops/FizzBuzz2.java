package Lab5_Loops;


import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 16/10/2025
 * Program description:
 */
public class FizzBuzz2 {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        int start, finish;
        //prompt user to enter the values
        System.out.print("Enter value for the start: ");
        start=keyboard.nextInt();
        System.out.print("Enter value for the finish: ");
        finish=keyboard.nextInt();
        //searching "fizz"/"buzz"/"fizzbuzz" numbers and output anything else
        for (int i=start; i<=finish; i++){
            if (((i%3)==0)&&(i%7)==0){
                System.out.println("FizzBuzz");
            }//if division 3 and 7
            else if ((i%7)==0){
                System.out.println("Buzz");
            }//else if division 7
            else if ((i%3)==0){
                System.out.println("Fizz");
            }//else if division 3
            else {
                System.out.println(i);
            }//else
        }//for

    }//main

}//class
