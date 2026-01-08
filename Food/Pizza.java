package Food;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 08/12/2025
 * Program description: subclass will inherit
 */

public class Pizza extends Food{
    //attributes - instance variables
    private String[]toppings;

    //constructor
    public Pizza(String name, int calories, String... toppings) {
        super(name, calories);
        this.toppings = toppings;
    }

    //getter and setter
    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    //methods
    public void showInfo() {
        super.showInfo();
        System.out.printf("Pizza Toppings: " + Arrays.toString(getToppings()));

    }
}//class
