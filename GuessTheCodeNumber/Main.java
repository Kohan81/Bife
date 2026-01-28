package GuessTheCodeNumber;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */

/**
 * The main class for running the game "Guess the Code Number"
 */
public class Main {
    public static void main(String[] args) {
        // Game started in the EDT (Event Dispatch Thread)
        javax.swing.SwingUtilities.invokeLater(() -> {
            try {
                // Initialization and showing GUI
                Visual.createAndShowGUI();
                System.out.println("Game started.");
            } catch (Exception e) {
                System.err.println("EXCEPTION: game failed to start.");
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(
                        null,
                        "EXEPTION: " + e.getMessage(),
                        "EXECUTION ERROR",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
            }
            //DigitFilter df = new DigitFilter();
        });
    }
}