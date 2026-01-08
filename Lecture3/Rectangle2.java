package Lecture3;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class Rectangle2 {
    public static void main(String[] args) {

        //declare scanner
        Scanner keyboard = new Scanner(System.in);

        //declare the variables
        int length;
        int breadth;

        //prompt user to enter a values

        System.out.print("Enter a value for the length: ");
        length=keyboard.nextInt();

        System.out.print("Enter a value for the breadth: ");
        breadth=keyboard.nextInt();

        //calculations
        int perimeter = (length+breadth) * 2;
        int area = length * breadth;

        System.out.println("rectangle length = " + length+
                "\nrectangle breadth = " + breadth+
                "\n\nrectangle perimeter = " + perimeter+
                "\nrectangle area = " + area);
    }
}
