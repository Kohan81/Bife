package Lab5_Loops;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 06/11/2025
 * Program description:
 */
public class AddNumber3_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final  int TERMINATOR = -999;
        int number, total=0;

        System.out.print("Enter first number: ");
        number=keyboard.nextInt();

        while(number!=TERMINATOR){
            total+=number;
            System.out.print("Enter a number (or End program by inputting -999) ");
            number=keyboard.nextInt();
        }//while
        System.out.println("The total is : " + total);
    }//main
}//class
