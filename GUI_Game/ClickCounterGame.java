package GUI_Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Fedir
 * Created on: 18/12/2025
 * Program description:
 */

public class ClickCounterGame {
    public static void main(String[] args) {
        JFrame F = new JFrame("Click Counter Game");
        //close program x
        F.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //set size of the window
        F.setSize(300, 200);
        //layout
        F.setLayout(null);//absolute position
        // set frame visible
        F.setVisible(true);
        //score text
        JLabel scoreLabel1 = new JLabel("Score: 0");
        scoreLabel1.setBounds(100, 30, 100, 30);
        F.add(scoreLabel1);
        //create a button
        JButton clickButton = new JButton("Click!");
        clickButton.setBounds(90, 80, 120, 40);
        F.add(clickButton);
        //setting score variable
        final int[] score = {0};
        //array used so value can change

        //button click
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //increase score
                score[0]++;
                //update label
                scoreLabel1.setText("Score: " + score[0]);
                scoreLabel1.repaint();
                //simple IF ( game rules )
                if (score[0]==10){
                    JOptionPane.showMessageDialog(F, "You win!", "Game over", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }//if
            }//action performed
        });//action listener


    }//main

}//class
