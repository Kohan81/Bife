package Lecture3;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class NextAndNextLine {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String word = keyboard.next(); // Hello world !
        System.out.println("next(): " + word); // just "Hello"

        // in buffer: " world !"

        String line = keyboard.nextLine(); // will read " world !"
        System.out.println("nextLine(): " + line); // " world !"

        keyboard.close();
    }
}
