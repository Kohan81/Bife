package Lab5_;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Create by Eugene
 * create on 16.10.2025
 * Program description
 */
public class NestForLoop {

    public static void main(String[] args) {

        for (int row = 3; row <= 5; row++) {
            for (int column = 1; column <= 4; column++) {
                System.out.print("\t" + (row * column));
            }
            System.out.println();
        }
    }

}//class
