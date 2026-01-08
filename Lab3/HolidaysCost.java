package Lab3;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by Eugene
 * create on 03/11/2025
 * Program description: Holiday cost calculator with user input or predefined examples
 */
public class HolidaysCost {

    // Declare variables as static
    static int numOfPeople;
    static double flightCost, transferCost, flightTotal, transferTotal, total;
    static String answer;
    // TAX constant
    final static double TAX = 0.20;

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        // Ask user if they want to enter values or see predefined examples
        answer = JOptionPane.showInputDialog("Do you want to enter values? Please enter yes or no");

        // Check user's choice
        if (answer != null && answer.equalsIgnoreCase("yes")) {
            // User chooses to enter custom values
            handleUserInput(df);
        } else {
            // User chooses to see predefined examples
            showPredefinedExamples(df);
        }
    }

    /**
     * Handles user input for custom holiday cost calculation
     */
    static void handleUserInput(DecimalFormat df) {
        // Get number of people from user
        answer = JOptionPane.showInputDialog("Enter the number of people: ");
        numOfPeople = Integer.parseInt(answer);

        // Get flight cost from user
        answer = JOptionPane.showInputDialog("Enter the cost of flight: €");
        flightCost = Double.parseDouble(answer);

        // Get transfer cost from user
        answer = JOptionPane.showInputDialog("Enter the cost of transfer: €");
        transferCost = Double.parseDouble(answer);

        // Perform calculations
        calculations(numOfPeople, flightCost, transferCost);

        // Display all results in a single message dialog for better user experience
        JOptionPane.showMessageDialog(null,
                "=== HOLIDAY COST CALCULATION ===\n" +
                        "TAX Rate: \t\t\t\t" + (TAX * 100) + "%\n" +
                        "Number of people: \t\t" + numOfPeople + "\n" +
                        "Flight cost per person: €" + df.format(flightCost) + "\n" +
                        "Transfer cost per person: €" + df.format(transferCost) + "\n" +
                        "Total flight cost: \t\t€" + df.format(flightTotal) + "\n" +
                        "Total transfer cost: \t€" + df.format(transferTotal) + "\n" +
                        "TOTAL COST: \t\t\t€" + df.format(total));
    }

    /**
     * Displays three predefined examples in sequential dialogs
     */
    static void showPredefinedExamples(DecimalFormat df) {
        // Predefined data sets
        int[] peopleArray = {6, 2, 10};
        double[] flightArray = {200, 250, 445};
        double[] transferArray = {30, 0, 25};

        // Show three sequential dialogs with different examples
        for (int i = 0; i < 3; i++) {
            // Perform calculations for current example
            calculations(peopleArray[i], flightArray[i], transferArray[i]);

            // Display results for current example
            JOptionPane.showMessageDialog(null,
                    "=== PRE-DEFINED EXAMPLE " + (i + 1) + " ===\n" +
                            "TAX Rate: \t\t\t\t" + (TAX * 100) + "%\n" +
                            "Number of people: \t\t" + peopleArray[i] + "\n" +
                            "Flight cost per person: €" + df.format(flightArray[i]) + "\n" +
                            "Transfer cost per person: €" + df.format(transferArray[i]) + "\n" +
                            "Total flight cost: \t\t€" + df.format(flightTotal) + "\n" +
                            "Total transfer cost: \t€" + df.format(transferTotal) + "\n" +
                            "TOTAL COST: \t\t\t€" + df.format(total),
                    "Holiday Cost - Example " + (i + 1),
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Performs calculations for holiday costs
     */
    static void calculations(int numOfPeople, double flightCost, double transferCost) {
        // Calculate total flight cost including TAX
        flightTotal = numOfPeople * (flightCost * (1 + TAX));
        // Calculate total transfer cost including TAX
        transferTotal = numOfPeople * (transferCost * (1 + TAX));
        // Calculate grand total
        total = flightTotal + transferTotal;
    }
}