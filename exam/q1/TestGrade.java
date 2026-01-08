package exam.q1;

/**
 * Created by Eugene
 * create on 11/12/2025
 * Program description:
 */

/**
 * 3. Your code should:
 * a. Use encapsulation (private fields, public methods).
 * b. Have no syntax errors.
 * c. Be well commented and easy to read.
 */

//2. Create a Main class called TestGrade with a main method that:

public class TestGrade {
    public static void main(String[] args) {

        //a. Creates at least two Student objects with different scores.

        Student student1 = new Student("John", 50);
        Student student2 = new Student("Eugene", 80);

        //b. Calls the methods to:
        //i. Display the original data.

        student1.displayStudent();
        student2.displayStudent();

        //ii. Change one score using setScore(), including one invalid attempt (e.g. 200).
        //iii. Display the updated data.

        student1.setScore(100);
        student1.displayStudent();

        student2.setScore(1000);
        student2.displayStudent();
    }
}
