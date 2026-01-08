package Lab6_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 17/11/2025
 * Program description:
 */

public class Cat extends Animal{
    //attributes - instance variables
    private String breed;
    private int numOfLives;
    //constructor

    public Cat() {
    }

    public Cat(String name, int age, String colour, int lifeExpectancy, String breed, int numOfLives) {
        super(name, age, colour, lifeExpectancy);
        this.breed = breed;
        this.numOfLives = numOfLives;
    }
//getter and setter

    public int getNumOfLives() {
        return numOfLives;
    }

    public void setNumOfLives(int numOfLives) {
        this.numOfLives = numOfLives;
    }

    //methods

    @Override
    public String toString() {
        return
                super.toString() +
                "\nbreed= " + breed +
                "\nnumOfLives=" + numOfLives;
    }
}//class
