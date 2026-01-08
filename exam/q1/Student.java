package exam.q1;

/**
 * Created by Eugene
 * create on 11/12/2025
 * Program description:
 */

/**
 * Student Grade Calculator (Classes, Encapsulation, Methods)
 *
 * You are asked to create a simple Object-Oriented program to manage a single student’s exam score and grade.
 *
 * Requirements
 *
 * 1. Create a class called Student with:
 */
public class Student {

    //a. Private fields:
    //i. name (String)
    //ii. score (int)

    private String name;
    private int score;

    //b. Constructor:
    //i. A constructor that accepts name and score.

    Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    //c. Methods:
    //i. setScore(int newScore)
    //1. Updates the student’s score.
    //2. If newScore is less than 0 or greater than 100, do not change the score and print a warning message.

    public void setScore(int newScore){
        if (newScore >= 0 && newScore <= 100) {
            score = newScore;
        } else {
            System.out.println("Invalid score. Score must be between 0 and 100.");
        }
    }

    //2. getScore()
    //i. Returns the current score.

    int getScore(){
        return score;
    }

    //3. calculateGrade()
    //1. Returns a char:
    //a. 'A' for score 80–100
    //b. 'B' for 65–79
    //c. 'C' for 50–64
    //d. 'D' for 40–49
    //e. 'F' for below 40

    char calculateGrade(){
        if (score >= 80) return 'A';
        else if (score >= 65) return 'B';
        else if (score >= 50) return 'C';
        else if (score >= 40) return 'D';
        else return 'F';
    }

    //4. displayStudent()
    //1. Prints the student’s name, score and grade to the screen.

    void displayStudent(){
        System.out.printf("%s: %d (%c)\n", name, score, calculateGrade());
    }
}
