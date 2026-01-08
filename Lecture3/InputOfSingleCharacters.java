package Lecture3;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description: Sometimes you want to read a single character from the keyboard
 * For example your program might ask the user a yes/no question and allow them
 * to enter 'Y' for yes or 'N' for no
 * The Scanner class does NOT have a method to read single characters directly
 * from the keyboard
 * We must use the next() or nextLine() methods from the Scanner class to read a
 * String from the keyboard and then convert it to a character
 */

public class InputOfSingleCharacters {
    public static void main(String[] args) {

        String input; //declare a String variable
        char letter; //declare a character variable letter

        Scanner keyboard = new Scanner(System.in);

        // Prompt for and accept a single character typed in
        // at the keyboard and assign it to the variable input
        System.out.print("Are you happy? (Y=yes, N=no): ");
        input = keyboard.nextLine();

        // Convert the String "Y" or "N" to a character 'Y' or 'N'
        letter = input.charAt(0);
        System.out.println("Letter entered was " + letter);

        //lines 21 and 24 could be combined into one statement:
        System.out.println("Letter entered was " + input.charAt(0));
    }
}
