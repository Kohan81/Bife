package Lecture3;

import javax.swing.*;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description:
 */
public class AdditionalTutor {
    public static void main(String[] args) {

        final int NUMBER1=12, NUMBER2=13;
        int answer;
        String answerString;

        answerString = JOptionPane.showInputDialog("What is " + NUMBER1 + "+" + NUMBER2 + "? ");

        answer = Integer.parseInt(answerString);

        JOptionPane.showMessageDialog(null, "Is your answer right?");

        if (answer==(12+13)){
            JOptionPane.showMessageDialog(null, "True");
        }else{
            JOptionPane.showMessageDialog(null,"False");
        }
    }
}
