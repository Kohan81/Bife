package voting;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Create by: Ciara
 * Create on: 11/12/2025
 * Program Description:
 */
public class TestVotingAgeChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter Name: " );
        name= keyboard.next();

        System.out.print("Enter Age: " );
        age= keyboard.nextInt();


        VotingAgeChecker userInput = new VotingAgeChecker(name, age);
        System.out.println(userInput.toString());
        //userInput.isOldEnoughToVote(age); this work called for the constructor
        System.out.println();

        VotingAgeChecker hardCodedData = new VotingAgeChecker("Ciara", 17);
        System.out.println(hardCodedData.toString());
        //hardCodedData.isOldEnoughToVote(hardCodedData.getAge());


    }//main
// scanner

}//class