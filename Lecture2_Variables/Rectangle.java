package Lecture2_Variables;

import java.text.DecimalFormat;

/**
 * Create by Eugene
 * create on 20.10.2025
 * Program description
 */
public class Rectangle {

    double length, breadth;

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * length + 2 * breadth;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.breadth = width;
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("###.##");

        Rectangle rectangle1 = new Rectangle(10, 20);
        System.out.println("Rectangle1 length  = " + df.format(rectangle1.length));
        System.out.println("Rectangle1 breadth = " + df.format(rectangle1.breadth));
        System.out.println("Rectangle1 Area = " + df.format(rectangle1.area()));
        System.out.println("Rectangle1 Perimeter = " + df.format(rectangle1.perimeter()));

        System.out.println();

        Rectangle rectangle2 = new Rectangle(5.2,4.3);
        System.out.println("Rectangle2 length  = " + df.format(rectangle2.length));
        System.out.println("Rectangle2 breadth = " + df.format(rectangle2.breadth));
        System.out.println("Rectangle2 Area = " + df.format(rectangle2.area()));
        System.out.println("Rectangle2 Perimeter = " + df.format(rectangle2.perimeter()));

        System.out.println();

        Rectangle rectangle3 = new Rectangle(34.55, 23.67);
        System.out.println("Rectangle3 length  = " + df.format(rectangle3.length));
        System.out.println("Rectangle3 breadth = " + df.format(rectangle3.breadth));
        System.out.println("Rectangle3 Area = " + df.format(rectangle3.area()));
        System.out.println("Rectangle3 Perimeter = " + df.format(rectangle3.perimeter()));

    }
}//class
