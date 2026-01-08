package Lab5_;

import java.text.DecimalFormat;

/**
 * Create by Eugene
 * create on 16.10.2025
 * Program description
 */
public class KilosToPounds {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        final double POUNDSINKILO = 2.2;
        System.out.println("Kilos to Pounds");

        for (int kilo = 5; kilo <= 100; kilo +=5) {
            double pounds = kilo * POUNDSINKILO;

            System.out.println(kilo + "\t\t\t" + df.format(pounds));
           // System.out.println(kilo + " kilos is " + df.format(pounds) + "  pounds");
        }
    }

}//class
