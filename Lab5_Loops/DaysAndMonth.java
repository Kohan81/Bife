package Lab5_Loops;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Eugene
 * create on 06/11/2025
 * Program description:
 */
public class DaysAndMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        int month;
        do{
            System.out.println("Enter the month (1-12)");
            month = keyboard.nextInt();
        } while(month < 1 || month > 12);{

        }
    }//main
}//class