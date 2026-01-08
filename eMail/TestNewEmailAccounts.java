package eMail;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 04/12/2025
 * Program description:
 */
public class TestNewEmailAccounts {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // instant variables create to for user to input the data
        String firstName, lastName, collegeName;
        int year;
        //
        char addMoreEmail='y'; // for the decide to end program or make more accounts
        // created object


        ///  output
        System.out.println("    Email Account Setup".toUpperCase() );
        System.out.println("==============================");
        System.out.println("====== Type 'n' to Exit ======");

        // while loop - loop will repeat the process each time when
        //              user is ask if they want to input a new game
        while (addMoreEmail=='y' || addMoreEmail=='Y'){
            System.out.println("------- Enter Data ------------ ".toUpperCase() );
            System.out.print(  "Enter Current College year : ");
            year= keyboard.nextInt();
            System.out.print("Enter First Name: ");
            firstName= keyboard.next();
            System.out.print("Enter Last Name: ");
            lastName= keyboard.next();
            //System.out.print("Enter College Title: ");
            //collegeName= keyboard.next();

            // new object
            New_EmailAccounts email2 = new New_EmailAccounts(year,firstName,lastName);
            // call object with toString method
            System.out.println(email2.toString());

            System.out.print("Do you want to create another Email account: (Y) or(N) ");
            addMoreEmail=keyboard.next().charAt(0);
            System.out.println();
        }// while

        System.out.println("Number of Email Created : "+ New_EmailAccounts.numberOfEmails());
        System.out.println("EXIT.....");
    }//main
}//class
