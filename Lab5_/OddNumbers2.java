package Lab5_;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Create by Eugene
 * create on 16.10.2025
 * Program description
 */
public class OddNumbers2 {
    public static void main(String[] args) {

        int total = 0;
        int nu0fOdd = 0;

        double average;

        for (int number = 1; number <= 50; number+=2) {
            System.out.println(number + " is odd number ");
            nu0fOdd++;
            total += number;

        }
        average = (double) total / nu0fOdd;
        System.out.println("The total number of odd numbers is " + total);
        System.out.println("The average number is " + average);
        }

}//class
