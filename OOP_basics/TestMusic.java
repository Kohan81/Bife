package OOP_basics;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 06/11/2025
 * Program description:
 */
public class TestMusic {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Music myMusic1 = new Music();
        Music myMusic2 = new Music("piano", 2);
        Music myMusic3 = new Music("violin");
    }
}
