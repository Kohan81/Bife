package Lecture3;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class DisplayTime2 {
    public static void main(String[] args) {

        Scanner keyboard= new Scanner(System.in);

        //declare variable
        int seconds,minutes, remainder;

        System.out.print("Enter a value for the seconds: ");
        seconds=keyboard.nextInt();

        //calculate
        minutes = seconds/60;
        remainder = seconds%60;

        //output the results
        System.out.println(seconds+ " Seconds is " +minutes+ " minutes and " +remainder+ " seconds");
    }
}
