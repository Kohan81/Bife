package Lab2;

import java.text.DecimalFormat;

/**
 * Create by Eugene
 * create on 20.10.2025
 * Program description
 */
public class Rectangle1 {
    public static void main(String[] args) {

                // Declare 4 variables to hold length,
               // breadth, perimeter and area
               double length, breadth, area, perimeter;
               DecimalFormat df = new DecimalFormat("00.00");

               // Assign values to length and breadth
               length = 24.7;
               System.out.println("Rectangle length  = " + length);

               breadth = 25.9;
               System.out.println("Rectangle breadth = " + breadth);

               // Calculate, store and print out the area
               area = length * breadth;
               System.out.println("Rectangle Area = " + df.format(area));

               // Calculate, store and print out the perimeter
               perimeter = (length + breadth) * 2.0;
               System.out.println("Rectangle Perimeter = " + df.format(perimeter));
    }
}//class
