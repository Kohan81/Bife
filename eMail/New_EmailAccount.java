package eMail;

import java.util.*;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 27/11/2025
 * Program description:
 */

public class New_EmailAccount {
    double rd = Math.random();
    static Scanner keyboard = new Scanner(in);

    //attributes - instance variables
    private String email,
            firstname,
            lastname,
            password="",
            collegeName;

    private final String emailSuffix = "wicklowvec.ie";
    private int year, passwordLength = 8;

    //*static countOfEmails
    static private int countEmails=0;

    //*email *
    //email year/ first letter of name / lastname / .bife@wicklowvec.ie
    //*course
    //*password
    //*First name, Last name
    //*passwordLength
    //*emailSuffix = @wicklowvec.ie
    //CollegeName

    //****************constructor*****************
    public New_EmailAccount() {
        countEmails++;
    }//default constructor

    public New_EmailAccount(String firstname, String lastname, String collegeName, int year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.collegeName = collegeName;
        this.year = year;

        //call the method for random password
        //call the method for college name
        //assign

        countEmails++;
    }//constructor - with 4 values

    public New_EmailAccount(String firstname, String lastname, int year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;

        this.collegeName = setCollegeName();
        //call the method for random password
        //call the method for college name
        //assign

        countEmails++;
    }//constructor - with 3 values

    //getter and setter for all properties

    //====================methods====================

    // set college{}
    private String setCollegeName(){
        System.out.println("ENTER CODE FOR COLLEGE \n1.BIFE\n2.GCC\n3.SCFE");
        int choice = keyboard.nextInt();
        return switch (choice) {
            case 1 -> "bife";
            case 2 -> "gcc";
            case 3 -> "scfe";
            default -> "";
        };//switch
    }//Set college{}

    // randomPassword{}
    public String randomPassword(){
        char passwordChar;
        for (short i = 0; i <= passwordLength; i++){
            //list of possible symbols for password
            //0 1 2 3 4 5 6 7 8 9 : ; < = > ? @
            // [ \ ] ^ _ `
            // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
            // a b c d e f g h i j k l m n o p q r s t u v w x y z
            passwordChar = (char)(rd * 25);//generating random number and converting into char
            password = password + passwordChar;

        }//for - generating one symbol every loop cycle
        return password;

    }//random password{}

    //return method - for getting all the information - toString

    @Override
    public String toString() {
        return  "\n***********************************"+
                "\n      Email Account setup " +
                "\n***********************************"+
                "\nFirstname     :'" + firstname + '\'' +
                "\nLastname      :'" + lastname + '\'' +
                "\ncollegeName   :'" + collegeName + '\'' +
                "\nyear          :" + year+
                "\nEmail         :" + email+
                "\nPassword      :" + password+
                "\n***********************************";
    }

    public static int numberOfEmails(){return countEmails;}//static numberOfEmails

}//class
