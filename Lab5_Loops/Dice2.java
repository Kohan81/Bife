package Lab5_Loops;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 06/11/2025
 * Program description: Using do while loop
 */
public class Dice2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        /*
        to do
        2 variables for 2 dice
        generate the first number / second
        prompt to continue
        read answer
         */

        int dice1, dice2;
        char responce;
        int sum = 0;

        do {
            dice1 = (int) ((Math.random() * 6) + 1);
            dice2 = (int) ((Math.random() * 6) + 1);
            System.out.println("The first number is " + dice1 + " and the second number is " + dice2);

            System.out.println("Do you want to continue? (y/n)");
            responce = keyboard.nextLine().charAt(0);
        }while (responce == 'y');
    }
}
