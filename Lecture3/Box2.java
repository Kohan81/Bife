package Lecture3;

import java.util.Scanner;

/**
 * Created by: Fedor
 * Created on: 06/10/2025
 * Program description:
 */
public class Box2 {
    public static void main(String[] args) {

        int height,width, depth;

        Scanner keyboard = new Scanner(System.in);

        System.out.print(" Enter a value for Height:");
        height= keyboard.nextInt();

        System.out.print(" Enter a value for Width:");
        width= keyboard.nextInt();

        System.out.print(" Enter a value for Depth:");
        depth= keyboard.nextInt();

        //calculate the box
        int perimeter= (4*height) + (4*width) + (4*depth);

        //int volume= height * width* depth
        System.out.println("The box is " + height+ "cm high, " + width + "cm wide and  "
                + depth + "cm deep");

        //System.out.("The volume of the box is " + volume+ " cms cubed");
        System.out.println("The perimeter of the box is " + perimeter + " cms");

    }//main

}//class
