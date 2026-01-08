package Ex_PoppyGame;

import MathRandom.MathRandom;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 04/12/2025
 * Program description:
 */

public class PuppyGame {
    public static void main(String[] args) {
        //create classes
        Scanner keyboard = new Scanner(in);
        MathRandom rd = new MathRandom();

        //declare variables
        int home1 = rd.MathRandom(-10, 10), home2= rd.MathRandom(-10, 10);
        String puppyName;
        int difficultyChoice;
        //welcome message
        System.out.println("\t\tLost animals");
        System.out.println("What level: \n1. Puppy\n2. Fox\n");
        System.out.print(":");
        difficultyChoice= keyboard.nextInt();

        if (difficultyChoice==1){
            System.out.println("\t\tLost puppy".toUpperCase());
            System.out.println("move keys ( w, a, s, d ) to reach " + home1 + ", " + home2);
            System.out.print("What puppy's name? : ");
            puppyName=keyboard.next();
            //make a new object
            Puppy_Level1 game1 = new Puppy_Level1(0, 0, puppyName);//start
            Fox_Level2 l2 = new Fox_Level2(0, 0);
            //while loop
            while(true) {
                System.out.println(puppyName + " is at:  Vertical: " + game1.move1 + "| Horizontal: " + game1.move2);
                System.out.print("move: ");
                char choice = keyboard.next().charAt(0);
                game1.move(choice);

                if (game1.move1 == home1 && game1.move2 == home2) {
                    System.out.println(puppyName + " found his home");
                    break;
                }//if
            }//while
        }//if
        if (difficultyChoice==2){
            home1*=2;
            home2*=2;
            System.out.println("\t\tLost fox".toUpperCase());
            System.out.println("move keys ( w, a, s, d ) to reach " + home1 + ", " + home2);
            //make a new object
            Fox_Level2 l2 = new Fox_Level2(0, 0);
            //while loop
            while(true) {
                System.out.println(" is at:  Vertical: " + l2.move1 + "| Horizontal: " + l2.move2);
                System.out.print("move: ");
                char choice = keyboard.next().charAt(0);
                l2.move(choice);

                if (l2.move1 == home1 && l2.move2 == home2) {
                    System.out.println("Fox found his home");
                    break;
                }//if
            }//while
        }//if
    }//main

}//class
