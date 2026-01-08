package Skills_Demo1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Create by Eugene
 * create on 20.10.2025
 * Program description
 */
public class StudentGrate {
    public static void main(String[] args) {

        /* the used there name and number of subjects,
         For loop gather all subjects
         prompt input for grade and read it in check if grade is valid
         for (int loop = 0; loop <subjectNumber; loop++){}
         add all the grade together to get a total
         calculate the average mark
         (if) to info user what profile they have-
         Distinction / merit or pass */


        // to do list

        // Scanner
        Scanner keyboard = new Scanner(System.in);

        int numberOfSubjects, total =0, average;

        // declare variable
        String name;

        // final values for marks
        final int DISTINCTION = 80, MERIT = 65, PASS = 50;

        // welcome message - output message
        System.out.println("------------------------");
        System.out.println("\t\twelcome".toUpperCase());
        System.out.println("\tstudent service".toUpperCase());
        System.out.println("------------------------");

        // prompt the user for quantity of subjects
        System.out.print("Enter your name: ".toUpperCase());
        name = keyboard.nextLine(); //read in name
        System.out.print("Enter number of subjects: ".toUpperCase());
        numberOfSubjects = keyboard.nextInt();// read in quantity
        System.out.println("-------------------------");

        // prompt and read for marks from within the for loop
        for (int count = 0; count < numberOfSubjects; count++) {
            //promt and read for marks from within the loop
            System.out.print("Enter your mark for subject: ".toUpperCase() + (count+1 + " : "));
            int mark = keyboard.nextInt();

            //check mark is valid
            if ((mark <0 ) || (mark > 100)) {
                System.out.println("Invalid mark. Try again.".toUpperCase());
                count-=1;
            }else{
                total += mark;
            }//else
        }
        // for with if else using || operators
        // calculate the results

        average = total / numberOfSubjects;
        // out put student average
        System.out.println("------------------------");
        System.out.println(name.toUpperCase() + "\tTotal score: ".toUpperCase() + total);
        System.out.println(name.toUpperCase() + "\tAverage score: ".toUpperCase() + average);
        System.out.println("\n");

        if (average >= DISTINCTION){
            System.out.println(name.toUpperCase() + ", DISTINCTION profile".toUpperCase());
        }else {
            if ((average < DISTINCTION) && (average >= MERIT)) {
                System.out.println(name.toUpperCase() + ", MERIT profile".toUpperCase());
            }else {
                if ((average < MERIT) && (average >= PASS)){
                    System.out.println(name.toUpperCase() + ", PASS profile".toUpperCase());
                }else {
                    System.out.println(name.toUpperCase() + ", unsuccessful".toUpperCase());
                }
            }

        }
    }

}//class
