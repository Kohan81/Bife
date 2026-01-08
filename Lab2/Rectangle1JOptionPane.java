package Lab2;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by Eugene
 * create on 02/11/2025
 * Program description: Write a Java application called Rectangle1JOptionPane.java to
 * perform the same task as question 3 but uses the JOptionPane
 * class to output the values of length, breadth, area and perimeter
 */

public class Rectangle1JOptionPane {
    public static void main(String[] args) {

        double length = 24.7;
        double breadth = 25.9;

        DecimalFormat df = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null, "Rectangle length  = " + length +
                "\nRectangle breadth = " + breadth +
                "\n\nRectangle Area = " + df.format(length * breadth) +
                "\nRectangle Perimeter = " + df.format((length + breadth) * 2.0));
    }
}
