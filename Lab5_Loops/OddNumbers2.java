package Lab5_Loops;


import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 13/10/2025
 * Program description:
 */
public class OddNumbers2 {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(in);

        int total=0, nuOfOdd = 0;
        double average;

        for (int number = 1; number<=50; number+=2){
            System.out.println(number+ " is odd number");
            nuOfOdd++;
            total=total+number;
        }//for

        average=(double)total/nuOfOdd;
        System.out.println("The total of all numbers is: "+total);
        System.out.println("The average of all numbers is: " + average);
    }//main
}//class
