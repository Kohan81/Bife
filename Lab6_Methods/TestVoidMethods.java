package Lab6_Methods;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 06/11/2025
 * Program description:
 */
public class TestVoidMethods {

    static Scanner keyboard = new Scanner(System.in);

    static void myMethod() {
        System.out.print( "What is your name? ");
        String name = keyboard.nextLine();
        System.out.println( "Hello, " + name + "!" );
    }

    static void myMethod2(){
        System.out.println("I am the second method called");
    }

    public static void main(String[] args) {

        myMethod();
        myMethod2();

    }
}
