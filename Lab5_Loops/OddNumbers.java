package Lab5_Loops;


import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 13/10/2025
 * Program description:
 */
public class OddNumbers {
    static void main(String[] args) {
        int total=0, nuOfOdd = 0;
        double average;
        for (int number = 1; number<=50; number++){
           if ((number%2)!=0){
               System.out.println(number+ " is odd number");
               nuOfOdd++;
               total=total+number;
           }//if
        }//for
        average=(double)total/nuOfOdd;
        System.out.println("The total of all numbers is: "+total);
        System.out.println("The average of all numbers is: " + average);
    }//main
}//class
