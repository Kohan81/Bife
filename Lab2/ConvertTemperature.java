package Lab2;

import java.text.DecimalFormat;

/**
 * Created by Eugene
 * create on 02/11/2025
 * Program description: Write a Java application called ConvertTemperature.java
 * which declares and initialises a
 * temperature in centigrade and calculates and outputs the equivalent temperature in fahrenheit.
 * The formula for conversion is:
 * fahrenheit = 9/5 * centigrade + 32
 * Your output should have the following format:
 * 100.00 degrees centigrade = 212.00 degrees Fahrenheit
 */

public class ConvertTemperature {
    public static void main(String[] args) {

        double centigrade1 = 36.8;
        double centigrade2 = -100;
        double centigrade3 = 25.65;

        calculatesToFahrenheit(centigrade1);
        calculatesToFahrenheit(centigrade2);
        calculatesToFahrenheit(centigrade3);
    }

    static void calculatesToFahrenheit(double centigrade){

        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println( centigrade + " degrees centigrade = " +
                df.format(9/5 * centigrade + 32) +
                " degrees Fahrenheit");
        System.out.println();
    }
}
