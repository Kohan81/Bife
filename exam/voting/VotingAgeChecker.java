package exam.voting;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Create by: Ciara
 * Create on: 11/12/2025
 * Program Description: user enters name and age
 * and then a message prints indicating whether they
 * are old enough to vote in an upcoming election.
 */
public class VotingAgeChecker {
    // scanner
    // variables  - encapuation -
    // we make the variable private to not allow access
    private int age;
    private String name;

    //==================Constructor======================

    public VotingAgeChecker() {
    }// default 1

    public VotingAgeChecker(int age, String name) {
        this.age = age;
        this.name = name;

    }//2

    public VotingAgeChecker(String name,int age) {
        this.age = age;
        this.name = name;
        this.isOldEnoughToVote(age);
    }//3


    public VotingAgeChecker( String name) {

        this.name = name;
    }//4

    //
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Voting Age Checker " +
                "\nage :" + age +
                "\nname :" + name +
                "\n======================= :";
    }


    public void isOldEnoughToVote(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to VOTE");
        }//
        else {
            System.out.println("You are NOT old enough to VOTE");
        }//else
    }//isOldEnoughToVote

}//class