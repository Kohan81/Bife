package Lab5_Loops;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 16/10/2025
 * Program description:
 */
public class KilosToPounds {
    static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        double pounds;
        final double POUNDSINKILO=2.2;

        System.out.println("Kilograms\t\tPounds");
        for (int kg=5; kg<=100; kg+=5){
            pounds=kg*POUNDSINKILO;
            System.out.println(kg + "\t\t\t\t" + df.format(pounds));
        }//for
    }//main

}//class
