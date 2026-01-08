package Lecture3;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class TestScanner {
    public static void main(String[] args) {

        //use Scanner class to interact with keyboard
        Scanner keyboard = new Scanner(System.in);

        //declare no valued ints
        int num1, num2, num3;

        //Create some variables types
        Double wage;
        String name;
        Boolean niceDay;

        //Prompt user to get values
        System.out.println("What is your name : ");
        name=keyboard.nextLine();

        System.out.println("What do you earn : ");
        wage=keyboard.nextDouble();

        System.out.println("Are you having a nice day : ");
        niceDay=keyboard.nextBoolean();

        System.out.println("Enter num1: ");
        num1=keyboard.nextInt();

        System.out.println("Enter num2: ");
        num2=keyboard.nextInt();

        //calculate
        num3=num1+num2;

        //output
        System.out.println(num1 + " + " + num2 + " = " + num3);
        System.out.println("name: " + name);
        System.out.println("wage: " + wage);
        System.out.println("niceday: " + niceDay);
    }
}
