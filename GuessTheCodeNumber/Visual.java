package GuessTheCodeNumber;

import GuessTheCodeNumber.Logic.DigitFilter;
import GuessTheCodeNumber.Logic.GameLogic;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */

public class Visual {
    // Interface components

    private static final Set<String> usedInputs = new HashSet<>();
    private static int validAttemptsCount = 0;

    private static JFrame gameFrame;
    private static JTextField textField;
    private static JTextPane textPane;
    private static JButton submitButton;
    private static JLabel triesLabel;
    private static JLabel rightNumbersLabel;
    private static JLabel rightPlaceLabel;

    private static void initializeFrame() {
        gameFrame = new JFrame("Guess the code number");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(285, 650);
        gameFrame.setLayout(null);
        gameFrame.setResizable(false);
    }

    private static void createInputField() {
        textField = new JTextField(4);
        textField.setBounds(110, 100, 50, 30);
        gameFrame.add(textField);
    }

    private static void createButton() {
        submitButton = new JButton("TRY");
        submitButton.setBounds(60, 140, 150, 30);
        gameFrame.add(submitButton);

        // Button Press Logic
        DigitFilter filter = new DigitFilter();

        submitButton.addActionListener(e -> {
            String input = getUserInput();
            if (input == null) input = "";
            input = input.trim();

            // 1) Check: exactly 4 digits
            if (!filter.isFourDigits(input)) {
                JOptionPane.showMessageDialog(
                        gameFrame,
                        "Please enter exactly 4 digits (0-9).",
                        "Invalid input",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            // 2) Check: the numbers are not repeated within the number
            if (!filter.hasNoRepeatedDigits(input)) {
                JOptionPane.showMessageDialog(
                        gameFrame,
                        "Digits must not repeat.",
                        "Invalid input",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            // 3) Check: this number has already been entered before
            if (usedInputs.contains(input)) {
                JOptionPane.showMessageDialog(
                        gameFrame,
                        "You already entered this number.",
                        "Duplicate input",
                        JOptionPane.INFORMATION_MESSAGE
                );
                return;
            }

            // 4) Everything is OK: we remember the number, display it, and increase the counter.
            usedInputs.add(input);
            appendToTextPane(input);

            validAttemptsCount++;
            updateCounter();

    });

    }

    private static void createTextPane() {
        textPane = new JTextPane();
        textPane.setBounds(10, 200, 250, 400);
        textPane.setText("\tYour input: \n");
        gameFrame.add(textPane);
    }

    private static void createLabels() {
        rightNumbersLabel = new JLabel("Right numbers: 0");
        rightNumbersLabel.setBounds(85, 25, 150, 30);
        gameFrame.add(rightNumbersLabel);

        rightPlaceLabel = new JLabel("Numbers in right place: 0");
        rightPlaceLabel.setBounds(40, 40, 150, 30);
        gameFrame.add(rightPlaceLabel);

        JLabel instructionLabel = new JLabel("Enter 4 different digits");
        instructionLabel.setBounds(80, 60, 150, 30);
        gameFrame.add(instructionLabel);

        triesLabel = new JLabel("You tried: 0");
        triesLabel.setBounds(100, 165, 150, 30);
        gameFrame.add(triesLabel);
    }

    private static void setupGameLogic() {
        // Game logic is initialized here
        new GameLogic();
    }

    private static void showFrame() {
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
    }

    // Methods for getting user input
    public static String getUserInput() {
        if (textField != null) {
            return textField.getText();
        }
        return "";
    }

    /**
     * Creates and shows GUI
     */
    public static void createAndShowGUI() {
        initializeFrame();
        createLabels();
        createInputField();
        createButton();
        createTextPane();
        setupGameLogic();
        showFrame();
    }

    //print user input code on the screen
    public static void appendToTextPane(String message) {
        if (textPane == null) return;

        String oldText = textPane.getText();
        textPane.setText(oldText + message + "\n");
    }

    private static void updateCounter() {
        triesLabel.setText("Attempts: " + validAttemptsCount);
    }

}