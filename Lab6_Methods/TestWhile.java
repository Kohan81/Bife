package Lab6_Methods;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Eugene
 * create on 10/11/2025
 * Program description:
 */
public class TestWhile {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(in);
        int number;
        final int END = 999;
        System.out.println("Enter a number first: ");
        number = keyboard.nextInt();

        while(number!= END){
            System.out.println("The number is: " + number);
            System.out.println("Enter a number (or End program by inputting 000): ");
            number = keyboard.nextInt();
        }
    }
}
