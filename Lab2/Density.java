package Lab2;

import java.text.DecimalFormat;

/**
 * Created by Eugene
 * create on 02/11/2025
 * Program description: Write a Java application called Density.java
 * which calculates the density of an object given its mass
 * and volume.
 */

public class Density {
    public static void main(String[] args) {

        double volume1 = 24.2;
        double volume2 = 20;
        double volume3 = 14.5;
        double volume4 = 100;

        double mass1 = 500;
        double mass2 = 3.4;
        double mass3 = 4.5;
        double mass4 = 100;

        destenyCalculation(mass1, volume1);
        destenyCalculation(mass2, volume2);
        destenyCalculation(mass3, volume3);
        destenyCalculation(mass4, volume4);
    }

    static void destenyCalculation(double mass, double volume) {

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Mass = " + df.format(mass) + " kg");
        System.out.println("Volume = " + df.format(volume) + " metres cubed");
        System.out.println("Density = " + df.format(mass/volume) + " kg per metre cubed");
        System.out.println();
    }
}
