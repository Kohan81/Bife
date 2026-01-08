package vidioGame;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 26/11/2025
 * Program description:
 */

public class TestVideoGame1 {
    //main method
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Create Scanner /df formate
        // instant variables create to for user to input the data
        int id;              // A unique number to identify the game
        String title;        // Name/title of the game (e.g. "Minecraft")
        String platform;     // Platform (e.g. "PC", "PS5", "Switch")
        String genre;        // Genre (e.g. "Action", "Sports", "RPG")
        int releaseYear;     // Year the game was released
        double rating;       // Rating out of 10
        double price;        // Price of the game (
        char addMoreGames= 'y';

        // OUTPUT - Welcome message / instruction
        System.out.println("================================");
        System.out.println("====== Video Game Program ======");
        System.out.println("======    Add New Games   ======");

        System.out.println("======  Type 'n' to Exit ======");

        // while loop - loop will repeat the process each time when
        //               user is ask if they want to input a new game
        while (addMoreGames == 'y' || addMoreGames == 'Y') {
            // -- Inside While
            // --- prompt user for ID
            System.out.print("Enter Game ID (integer) : ");
            id= keyboard.nextInt();

            // --- prompt user for title
            System.out.print("Enter Game Title: ");
            title= keyboard.next();
            // --- prompt user for platform
            System.out.print("Enter Game Platform: ");
            platform= keyboard.next();
            // --- prompt user for rating
            System.out.print("Enter Game Rating (1-10): ");
            rating= keyboard.nextInt();
            // --- prompt user for genre
            System.out.print("Enter Game Genre: ");
            genre= keyboard.next();
            // --- prompt user for year
            System.out.print("Enter Game Year release: ");
            releaseYear= keyboard.nextInt();
            // --- prompt user for price
            System.out.print("Enter Game Price: €");
            price= keyboard.nextDouble();

            // --- create an object from a constructor that holds all the properties
            VideoGame1 newGame = new VideoGame1(id,title,platform,genre,releaseYear,rating,price);
            // --- call the method to print all information
            System.out.println(newGame.toString());


            // ask user if they want to go again y or n
            System.out.print("Do you wish to add another game? (y/n) :  ");
            addMoreGames=keyboard.next().charAt(0);
            keyboard.nextLine();
            System.out.println();
        }  // ------- while loop ends here

        System.out.println("you are finish adding game");

        // display total numbers of game
        System.out.println("Total Games Created : " + VideoGame1.numberOfGames());
        System.out.println("Goodbye!\nExit.. ");

    }//main
}//class