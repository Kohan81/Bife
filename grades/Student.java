package grades;

/**
 * Created by Eugene
 * create on 11/12/2025
 * Program description:
 */
public class Student {


    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. The score must be between 0 and 100.");
            return;
        }
        this.score = score;
    }

    public String toString() {
        return name + " " + score;
    }

    int calkulateGrted() {
        return score / 10;
    }
}
