package Lab6_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 17/11/2025
 * Program description:
 */

public class TestAnimal {
    public static void main(String[] args) {

        Animal c1 = new Cat("Kitty", 3, "gray", 12, "breed", 8);

        Animal k1 = new Kitten("Kitty Jn.", 1, "gray", 15, "breed", 9, "milk");
        //call objects with method
        System.out.println(c1.toString());
        System.out.println(k1.toString());

    }//main
    //attributes - instance variables
    //constructor 
    //getter and setter
    //methods

}//class
