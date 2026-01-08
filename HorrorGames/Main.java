package HorrorGames;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 05/01/2026
 * Program description:
 */

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);

        //primitive variables
        String userNameTemp, passwordTemp;

        //output - welcome message
        System.out.println("**********************\n  Multi-horror games\n**********************");
        System.out.print("Enter a user name: ");// prompt user

        userNameTemp = keyboard.next();// input - read in user input
        System.out.print("Enter a password: ");// prompt user

        passwordTemp = keyboard.next();// input - read in user input

        //create a new object
        SetUp player = new SetUp(userNameTemp, passwordTemp);
        player.welcomeMessage();
    }//main

}//class
