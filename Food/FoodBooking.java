package Food;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by: Fedir
 * Created on: 08/12/2025
 * Program description: main method app - create object - call methods
 */

public class FoodBooking {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        //declare variables
        String name;
        int calories;
        //output the welcome message
        System.out.println("\t\tFood booking app".toUpperCase());
        System.out.println("***********************************");
        //prompt the user
        System.out.println("Order of food menu or Pizza");
        System.out.println("Press    |\t1\t|  or | 2  |");
        int choice =keyboard.nextInt();

        if(choice==1){
            System.out.println("\t\tMenu");
            System.out.println("Burger ------ 250kcal ------ 10€");
            System.out.println("Salad ------ 150kcal ------ 6€");
            System.out.println("Enter food name ");
            name=keyboard.next();
            System.out.println("Enter calories");
            calories=keyboard.nextInt();

            Food booking1 = new Food(name, calories);
            booking1.showInfo();
        }//if

    }//main

}//class
