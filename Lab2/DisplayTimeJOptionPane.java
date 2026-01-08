package Lab2;

import javax.swing.*;

/**
 * Created by Eugene
 * create on 02/11/2025
 * Program description: Write a Java application called DisplayTimeJOptionPane.java to
 * perform the same task as question 8 but uses the JOptionPane to output
 */

public class DisplayTimeJOptionPane {
    public static void main(String[] args) {

        int seconds = 5000;

        JOptionPane.showMessageDialog(null, seconds + " seconds is "
                + seconds/60 + " minutes and " + seconds % 60
                +" seconds");

    }
}
