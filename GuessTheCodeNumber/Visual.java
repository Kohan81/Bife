package GuessTheCodeNumber;

import GuessTheCodeNumber.Logic.GameLogic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */

public class Visual {
    // Interface components
    private static JFrame gameFrame;
    private static JTextField textField;
    private static JButton submitButton;
    private static JLabel triesLabel;
    private static JLabel rightNumbersLabel;
    private static JLabel rightPlaceLabel;

    /**
     * Creates and shows GUI
     */
    public static void createAndShowGUI() {
        initializeFrame();
        createLabels();
        createInputField();
        createButton();
        setupGameLogic();
        showFrame();
    }

    private static void initializeFrame() {
        gameFrame = new JFrame("Guess the code number");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(285, 250);
        gameFrame.setLayout(null);
        gameFrame.setResizable(false);
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

    private static void createInputField() {
        textField = new JTextField(4);
        textField.setBounds(110, 100, 50, 30);
        gameFrame.add(textField);
       // ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DigitFilter());
    }

    private static void createButton() {
        submitButton = new JButton("TRY");
        submitButton.setBounds(60, 140, 150, 30);
        gameFrame.add(submitButton);
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
}