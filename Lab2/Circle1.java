package Lab2;

import java.text.DecimalFormat;

/**
 * Created by Eugene
 * create on 02/11/2025
 * Program description:Write a Java application called Circle1.java which declares
 * and initialises the radius of a circle and
 * then calculates and prints the diameter, circumference and area. Use the formulae:
 * Diameter = 2 * radius
 * Circumference = 2 * π * radius
 * Area = π * (radius) 2
 * Try using the Math.PI for π and the Math function for squaring a number.
 */

public class Circle1 {
    public static void main(String[] args) {

        double radius1 = 5;
        double radius2 = 5.5;
        double radius3 = 8.25;

        circleInfo(radius1);
        circleInfo(radius2);
        circleInfo(radius3);
    }

    static void circleInfo(double radius){

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The radius is " + radius + " units");
        System.out.println("The diameter is " + df.format(2 * radius) + " units");
        System.out.println("The circumference is " + df.format(2 * Math.PI * radius) + " units");
        System.out.println("The area is " + df.format(Math.PI * (radius * radius)) + " units");
        System.out.println();
    }
}
