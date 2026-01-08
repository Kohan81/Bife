package GUI_Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Eugene
 * create on 05/01/2026
 * Program description:
 */
public class MyClickCounterGame {

    public static void main(String[] args) {

        // Метод showInputDialog() показывает диалоговое окно и возвращает введенный текст
        String name = JOptionPane.showInputDialog("Введите ваше имя:");

        if (name != null && !name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Привет, " + name + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Имя не было введено.");
        }

        // Пример с числом
        String ageString = JOptionPane.showInputDialog("Введите ваш возраст:");
        try {
            int age = Integer.parseInt(ageString); // Преобразуем строку в число
            JOptionPane.showMessageDialog(null, "Вам " + age + " лет.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Некорректный ввод возраста.");
        }

        JFrame F = new JFrame("Click Counter Game");
        //close program x
        F.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //set size of the window
        F.setSize(360, 300);
        //layout
        F.setLayout(null);//absolute position
        // set frame visible
        F.setVisible(true);
        //score text
        JLabel scoreLabel1 = new JLabel("Player 1: 0");
        scoreLabel1.setBounds(80, 30, 100, 30);
        F.add(scoreLabel1);
        //score text
        JLabel scoreLabel2 = new JLabel("Player 2: 0");
        scoreLabel2.setBounds(220, 30, 100, 30);
        F.add(scoreLabel2);
        //create a button
        JButton clickButton = new JButton("Click!");
        clickButton.setBounds(50, 80, 100, 40);
        F.add(clickButton);
        JButton clickButton2 = new JButton("Clock!");
        clickButton2.setBounds(200, 80, 100, 40);
        F.add(clickButton2);
        //setting score variable
        final int[] score = {0, 0};
        //array used so value can change

        //button click
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //increase score
                score[0]++;
                //update label
                scoreLabel1.setText("Player 1: " + score[0]);
                scoreLabel1.repaint();
                //simple IF ( game rules )
                if (score[0]==10){
                    JOptionPane.showMessageDialog(F, "Player 1 win!", "Game over", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }//if
            }//action performed
        });//action listener

        //button 2 click
        clickButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //increase score
                score[1]++;
                //update label
                scoreLabel2.setText("Player 2: " + score[1]);
                scoreLabel2.repaint();
                //simple IF ( game rules )
                if (score[1]==10){
                    JOptionPane.showMessageDialog(F, "Player 2 win!", "Game over", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }//if
            }//action performed
        });//action listener

    }//main

}
