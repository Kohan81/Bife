package GuessTheCodeNumber;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
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

        //score text
        JLabel scoreLabel1 = new JLabel("Right numbers: 0");
        scoreLabel1.setBounds(85, 25, 150, 30);
        gameFrame.add(scoreLabel1);

        //score text
        JLabel scoreLabel2 = new JLabel("Numbers in right place: 0");
        scoreLabel2.setBounds(40, 40, 150, 30);
        gameFrame.add(scoreLabel2);

        //score text
        JLabel scoreLabel3 = new JLabel("Enter 4 different digits");
        scoreLabel3.setBounds(80, 60, 150, 30);
        gameFrame.add(scoreLabel3);

        // Однострочное поле
        JTextField textField = new JTextField(4); // 4 digits
        textField.setBounds(110, 100, 50, 30);
        gameFrame.add(textField);
        // Примените фильтр к полю ввода
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DigitFilter());


        // Кнопка подтверждения
        JButton submitButton = new JButton("TRY");
        submitButton.setBounds(60, 140, 150, 30);
        gameFrame.add(submitButton);

        gameFrame.setLocationRelativeTo(null); // Центрировать окно на экране
        gameFrame.setVisible(true);

        gameFrame.setResizable(false); // Фиксированный размер окна

        // Важно: setVisible в конце
        gameFrame.setVisible(true);
    }
}

// Класс-фильтр для ограничения ввода
class DigitFilter extends DocumentFilter {
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        // Проверяем: текст — цифра И в поле еще нет символов (или мы заменяем существующий)
        if (text.matches("\\d") && (fb.getDocument().getLength() - length + text.length() <= 4)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
}
