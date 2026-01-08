package Lab5_Loops;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 06/11/2025
 * Program description:
 */
public class DisplayMenu {
    public static void main(String[] args) {

        int choice;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("\n1.  Hockey");
            System.out.println("2.  Football");
            System.out.println("3.  Rugby");
            System.out.println("4.  Exit");
            System.out.print("\nPlease enter your choice: ");
            choice = keyboard.nextInt();

            keyboard.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\nYou have chosen Hockey");
                    break;
                case 2:
                    System.out.println("\nYou have chosen Football");
                    break;
                case 3:
                    System.out.println("\nYou have chosen Rugby");
                    break;
                case 4:
                    System.out.println("\nYou have chosen to Exit the system");
                    break;
                default:
                    System.out.println("\nInvalid choice");
            }//switch
        }while (choice != 4);{

        }

    }
}
