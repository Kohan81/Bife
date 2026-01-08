package Lab2;

/**
 * Created by Eugene
 * create on 02/11/2025
 * Program description: Write a Java application called DisplayTime.java
 * which declares and initialises an integer variable
 * called seconds to represent a time in seconds, then outputs the time in minutes and seconds in the
 * following format: 5000 seconds is 83 minutes and 20 seconds
 */

public class DisplayTime {
    public static void main(String[] args) {

        int seconds = 5000;

        System.out.println(seconds + " seconds is "
                + seconds/60 + " minutes and " + seconds % 60
                +" seconds");
    }
}
