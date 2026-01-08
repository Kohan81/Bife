package vidioGame;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Eugene
 * create on 26/11/2025
 * Program description:
 */
public class MyTestMyVideoGame {

    private static char answer;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Hi, we are collection all video games in our store.");

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00€");

        do {
            System.out.println("Add your favorite video game please ");
            System.out.println();

            MyVideoGame videoGame = new MyVideoGame();
            MyVideoGame.setNumberOfGames(MyVideoGame.getNumberOfGames() + 1);
            System.out.print("Enter a video game name: ");
            videoGame.setGameName(keyboard.next());
            System.out.println();
            System.out.print("Enter the game's genre: ");
            videoGame.setGenre(keyboard.next());
            System.out.println();
            System.out.print("Enter the game's platform: ");
            videoGame.setPlatform(keyboard.next());
            System.out.println();
            System.out.print("Enter the game's rating (in Double format 1-10): ");
            videoGame.setRating(keyboard.nextDouble());
            System.out.println();
            System.out.print("Enter the game's release year (in Integer format XXXX): ");
            videoGame.setReleaseYear(keyboard.nextInt());
            System.out.println();
            System.out.print("Enter the game price (in Double format): ");
            videoGame.setPrice(keyboard.nextDouble());
            System.out.println();

            System.out.print("Do you want to add another video game? (y/n)\n");

            answer = keyboard.next().charAt(0);
            if (answer == 'y') {
                System.out.println(videoGame);
                System.out.println();
            } else {
                System.out.println(videoGame);
                System.out.println();
                System.out.println("Thank you for your purchase!");
                MyVideoGame.printResult();
                System.out.println("Thank you for all your purchases! Bye!!!");
            }

        } while (answer == 'y');
    }
}
