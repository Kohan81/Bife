package Lab6_Methods;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Eugene
 * create on 06/11/2025
 * Program description:
 */
public class AddingNumbers4 {

    //this user input belongs to the class
    static Scanner keyboard = new Scanner(in);

    static void addNumbers() {
        final int TERMINATOR = -999;
        int number, total = 0;

        System.out.print("Enter first number: ");
        number = keyboard.nextInt();

        while (number != TERMINATOR) {
            total += number;
            System.out.print("Enter a number (or End program by inputting -999) ");
            number = keyboard.nextInt();
        }//while
        System.out.println("The total is : " + total);
    } //addNumbers method

    public static void main(String[] args) {
        addNumbers();
    }//main
}