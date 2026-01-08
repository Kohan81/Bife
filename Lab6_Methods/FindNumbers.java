package Lab6_Methods;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 10/11/2025
 * Program description:
 */
public class FindNumbers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //declare variables
        int CORRECT_NUMBER = (int) (Math.random() * 100);
        int guess;
        int score = 1000;

        //promt user from 1 to 10
        //read in number- check is correct
        //if not guess again
        //if correct print out the number

        do {
            System.out.println("You have " + score + " points left");
            System.out.println("----------------------------");
            System.out.print("Enter a number between 1 and 100: ");
            guess = keyboard.nextInt();
            if (guess != CORRECT_NUMBER) {
                System.out.println("Sorry ".toUpperCase() + "it's INCORRECT number");
                score -= 10;
                System.out.println(" You get minus 10 points!");
                System.out.println();
                System.out.println("Do you want to try again? (y/n)");
                String response = keyboard.next();
                if (response.charAt(0) == 'n') {
                    System.out.println("Goodbye!");
                    break;
                } else if (response.charAt(0) == 'y') {
                    System.out.println("Okay! Let's try again!!!");
                    if (guess < CORRECT_NUMBER) {
                        System.out.println("your guess is " + guess + " it's too low".toUpperCase());
                    } else if (guess > CORRECT_NUMBER) {
                        System.out.println("your guess is " + guess + " it's too high!".toUpperCase());
                    }
                }
            }
        } while (guess != CORRECT_NUMBER);
        {
            System.out.println("Well done! It's the correct number!!!".toUpperCase());
            System.out.println("Your score is ".toUpperCase() + score);
            System.out.println("----------------------------");
        }

    }
}
