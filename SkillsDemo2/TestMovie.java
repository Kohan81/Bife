package SkillsDemo2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eugene
 * create on 03/12/2025
 * Program description:
 */
public class TestMovie {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        char answer;

        System.out.print("Hello. Do you want to add some movies, to collection? (y/n)");
        if (keyboard.next().equalsIgnoreCase("y")){
            do {
                Movie movie = new Movie();
                System.out.println("Enter movie name: ");
                movie.setTitle(keyboard.next());

                System.out.println("Enter director of movie: ");
                movie.setDirector(keyboard.next());

                System.out.println("Enter movie genre: ");
                movie.setGenre(keyboard.next());

                System.out.println("Enter movie releaseYear: ");
                movie.setReleaseYear(keyboard.nextInt());

                System.out.println("Do you want to add another movie? (y/n)");
                answer = keyboard.next().charAt(0);

                System.out.println("Thank you for adding movie to collection.");
                System.out.println("You added this movie: ");
                System.out.println(movie);
                System.out.println();
            } while (answer == 'y');
        }
    }
}
