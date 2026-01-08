package GuessTheCodeNumber;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;

/**
 * Created by Eugene
 * create on 05/01/2026
 * Program description:
 */
public class Visual {

    public static void main(String[] args) {
        JFrame gameFrame = new JFrame("Guess the code number");

        //close program x
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set the size of the window
        gameFrame.setSize(300, 250);

        //layout
        gameFrame.setLayout(null);

        // set frame visible
        gameFrame.setVisible(true);

        //score text
        JLabel scoreLabel1 = new JLabel("Player 1: 0");
        scoreLabel1.setBounds(60, 30, 100, 30);
        gameFrame.add(scoreLabel1);

        //score text
        JLabel scoreLabel2 = new JLabel("Player 2: 0");
        scoreLabel2.setBounds(60, 60, 100, 30);
        gameFrame.add(scoreLabel2);

        // --- Добавляем поля для ввода 4 цифр ---


        // Однострочное поле
        JTextField textField = new JTextField(20); // 20 символов шириной
        textField.setText("Введите имя...");
        textField.setVisible(true);


        // Массив для хранения полей, чтобы к ним было удобно обращаться
        JTextField[] codeFields = new JTextField[4];
        int startX = 60; // Начальная координата X

        for (int i = 0; i < 4; i++) {
            codeFields[i] = new JTextField();
            // Смещение каждого поля на 40 пикселей вправо
            codeFields[i].setBounds(startX + (i * 40), 130, 30, 30);
            // Центрируем текст внутри поля
            codeFields[i].setHorizontalAlignment(JTextField.CENTER);
            gameFrame.add(codeFields[i]);
        }

        // Кнопка подтверждения
        JButton submitButton = new JButton("Guess");
        submitButton.setBounds(60, 180, 150, 30);
        gameFrame.add(submitButton);

        // Важно: setVisible в конце
        gameFrame.setVisible(true);
    }
}

// Класс-фильтр для ограничения ввода
class DigitFilter extends DocumentFilter {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        // Проверяем: текст — цифра И в поле еще нет символов (или мы заменяем существующий)
        if (text.matches("\\d") && (fb.getDocument().getLength() - length + text.length() <= 1)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
}
