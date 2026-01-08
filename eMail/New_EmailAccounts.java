package eMail;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 04/12/2025
 * Program description:
 */
public class New_EmailAccounts {



    // To do List
    //========================== attributes ==========================
    static Scanner keyboard = new Scanner(System.in);
    private String emailSuffix= "@wicklowvec.ie";
    private String email, firstName, lastName, password, collegeName;
    private int year;
    private int defaultPasswordLength = 10;


    private static int countEmail = 0;


    //======================= constructor =================


    public New_EmailAccounts() {
        countEmail++;
    } //default constructor - never used

    public New_EmailAccounts( int year, String firstName, String lastName, String collegeName) {
        this.firstName = firstName;
        this. lastName = lastName;
        this.collegeName = collegeName;
        this.year = year;

        //call the method for random password
        // call meth for college name
        // assign all values to email
        countEmail++;
    }//constructor - 4 properties this is never used


    public New_EmailAccounts( int year, String firstName, String lastName) {

        this.firstName = firstName;
        this. lastName = lastName;
        this.year = year;

        // call method for college name
        this.collegeName=setCollageName();
        //call the method for random password
        this.password=randomPassword(defaultPasswordLength);

        // assign all values to email
        email=Integer.toString(year)+firstName.charAt(0)+lastName+collegeName+emailSuffix;

        countEmail++;
    }//constructor - 3 properties - used for input


    //===========================  methods ===========================

    // set college{}
    private  String setCollageName() {
        System.out.println("\nENTER CODE FOR COLLEGE \n1. Bray \n2. GreyStone \n3. Sallynoggin");
        int choice = keyboard.nextInt();
        if (choice == 1) {
            return "bife";
        } //if
        else if (choice == 2) {
            return "gcc";
        }//else if
        else if (choice == 3) {
            return "scfe";
        }//else if
        else {
            return "";
        }//else
    }//setCollageName
    // randomPassword{}
    //return method  - for getting all the information - toString

    @Override
    public String toString() {
        return "\n      Email Account Setup".toUpperCase() +
                "\n=============================="+
                "\nFirst Name   :" + firstName +
                "\nLast Name    :" + lastName +
                "\nYear         :" + year +
                "\nCollege Name :" + collegeName +
                "\nEmail        :" + email.toLowerCase()+
                "\nPassword     :" + password;
    }


    // set up random password
    private  String randomPassword(int lengthPassword){
        //all possible option that our password can be made up with
        String passwordSet=  "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!*%$&";
        //Array of character ,  it will collect all the char  for the password
        char[] password = new char[lengthPassword];

        for(int loop = 0; loop<lengthPassword; loop++){
            // casting char length  as in int
            int randomGen= (int) (Math.random() * passwordSet.length());
            password[loop] =passwordSet.charAt(randomGen);
        }
        return new String(password);
    }//randomPassword



    //static numberOfEmails will count the number of booking entered
    public static int numberOfEmails(){
        return countEmail;
    }


}//class