package Lab5_Loops;


import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 13/10/2025
 * Program description:
 */
public class AddingNumbers2 {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        int number, total =0;
        final int HOWMANY=3;

        for (int count=1; count<HOWMANY; count++){
            System.out.print("Enter a number\t\t\t\t:");
            number=keyboard.nextInt();
            total=total+number;
        }//for
        System.out.println("The total of all number \t:"+ total);
    }//main

}//class
