package Lab6_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 17/11/2025
 * Program description:
 */

public class Kitten extends Cat{
    //attributes - instance variables
    private String babyFood;

    //constructor
    public Kitten(String name, int age, String colour, int lifeExpectancy, String breed, int numOfLives, String babyFood) {
        super(name, age, colour, lifeExpectancy, breed, numOfLives);
        this.babyFood = babyFood;
    }//def con

    //getter and setter
    //methods

    @Override
    public String toString() {
        return super.toString() +
                "\nbabyFood='" + babyFood + '\'';
    }
}//class
