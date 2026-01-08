package Lab6_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 17/11/2025
 * Program description: super/parent class
 */

public abstract class Animal {
    //attributes - instance variables
    private String name, colour;
    private int age, lifeExpectancy;

    //constructor
    public Animal(){
    }//default constructor

    public Animal(String name, int age, String colour, int lifeExpectancy){
        this.name=name;
        this.age=age;
        this.colour=colour;
        this.lifeExpectancy=lifeExpectancy;
    }//alt con

    //getter and setter
    public int getLifeExpectancy(){
        return lifeExpectancy;
    }//getter

    public void setLifeExpectancy(int lifeExpectancy){
        this.lifeExpectancy=lifeExpectancy;
    }

    //methods

    public String toString(){
        return "\nname: " + name+
                "\nage: " + Integer.toString(age)+
                "\ncolour: " + colour;
    }//toString
}//class
