package Lecture3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class Circle2 {
    public static void main(String[] args) {

        //declare classes
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //declare the variables
        double radius;
        double diameter, circumference, area;

        //prompt user for radius
        System.out.print("Enter a value for the radius: ");
        radius = keyboard.nextDouble();

        //calculating
        diameter=radius*2;
        circumference=2*Math.PI*radius;
        area=Math.PI*(radius*radius);

        //output
        System.out.println("The Radius is " + df.format(radius)+" units");
        System.out.println("The Diameter is " + df.format(diameter)+" units");
        System.out.println("The Circumference is " + df.format(circumference)+" units");
        System.out.println("The area is " + df.format(area)+" units");
    }
}
