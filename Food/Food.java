package Food;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 08/12/2025
 * Program description: super class which will hold all similar attributes
 */

public class Food {
    //attributes - instance variables
    private String name;
    private int calories;

    //constructor
    public Food() {
    }//Default Constructor

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }//Alt constructor - all values

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    // user defined methods
    public void showInfo() {
        System.out.println( "  Food Booking" +
                "\nname    : " + name +
                "\ncalories: " + calories +
                "\n*************************");
    }
}//class
