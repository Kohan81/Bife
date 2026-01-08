package Lab5_Loops;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 16/10/2025
 * Program description:
 */
public class NestForLoop {
    static void main(String[] args) {
        for (int row=1; row<=3; row++){
            for(int column=1; column <=4; column++) {
                System.out.print("\tX");
            }//for column
            System.out.println();
        }//for row

    }//main

}//class
