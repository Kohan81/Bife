package exam;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 11/12/2025
 * Program description:
 */

//6. Write a test class named TestDateOfBirth
public class TestDateOfBirth {
    public static void main(String[] args) {

        //Create an object for DateOfBirth the passes through all values

        DateOfBirth dateOfBirth1 = new DateOfBirth("Eugene", 8, 1, 1981);

        //From test, prompt user for information and use scanner with variable for each instance variables
        //Example: String userName = keyboard.next();
        //DOB1.setName(userName);

        Scanner keyboard = new Scanner(System.in);

        DateOfBirth dateOfBirth2 = new DateOfBirth();

        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        dateOfBirth2.setName(name);

        System.out.println("Enter your DAY of birth: ");
        int day = keyboard.nextInt();
        dateOfBirth2.setDay(day);

        System.out.println("Enter your MONTH of birth: ");
        int month = keyboard.nextInt();
        dateOfBirth2.setMonth(month);

        System.out.println("Enter your YEAR of birth: ");
        int year = keyboard.nextInt();
        dateOfBirth2.setYear(year);

        dateOfBirth1.displayDOB();
        dateOfBirth2.displayDOB();
    }
}
