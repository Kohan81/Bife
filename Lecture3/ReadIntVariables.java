package Lecture3;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 02/11/2025
 * Program description: Program to read integer values from the
 * keyboard and print them out
 */

public class ReadIntVariables {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        // Sets up an object of the Scanner class
        // allowing us to use it to read
        // values from the keyboard
        // Declare two integer variables length and breadth

        int length, breadth;
        // ALWAYS prompt the user for a value first
        // then read from the keyboard
        // FIRST – the PROMPT (use a print)
        // Read in values for length and breadth

        System.out.print("Enter a value for length: ");
        // returns the next keyboard input as a value
        // of type int to the variable length
        // NEXT – the READ

        length = keyboard.nextInt();

        // REPEAT …. FIRST – the PROMPT
        System.out.print("Enter a value for breadth: ");

        // NEXT – the READ
        breadth = keyboard.nextInt();

        // Output the values entered for length and breadth
        System.out.println("Length value entered was: " + length);
        System.out.println("Breadth value entered was: " + breadth);

        }//main
 }//class
