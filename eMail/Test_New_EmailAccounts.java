package eMail;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 27/11/2025
 * Program description:
 */

public class Test_New_EmailAccounts {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(in);
        char addMoreEmail;

        /// output
        System.out.println("\n***********************************" +
                "\n      Email Account setup ".toUpperCase() +
                "\n   Type 'n' to exit " +
                "\n***********************************");

        addMoreEmail = keyboard.next().charAt(0);
        if (addMoreEmail == 'n' || addMoreEmail == 'N') {
            System.out.println("\nThank you for using our service. \nHave a nice day!");
            return;
        }
        do {
            System.out.print("Enter your first name: ");
            String firstName = keyboard.next();
            System.out.print("Enter your last name: ");
            String lastName = keyboard.next();

            //System.out.print("Enter the name of college: ");
            //collegeName= keyboard.next();
            System.out.print("Enter current college year: ");
            int year = keyboard.nextInt();

            //new object
            New_EmailAccount email = new New_EmailAccount(firstName, lastName, year);
            //call object with toString method
            System.out.println(email);

            //prompt the user if they want to go again
            System.out.print("Do you want to create another email account? y/n : ");
            addMoreEmail = keyboard.next().charAt(0);

        } while ((addMoreEmail == 'y') || (addMoreEmail == 'Y'));//while loop
        System.out.println("Number of emails created : " + New_EmailAccount.numberOfEmails());

    }//main

}//class
