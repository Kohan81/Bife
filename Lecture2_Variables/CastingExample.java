package Lecture2_Variables;

public class CastingExample {
    public static void main(String[] args) {

        // Declare and initialise cost
        double cost = 197.55;

        // Declare and initialise taxRate
        double taxRate = 0.06;

        // Declare a variable to store the amount payable
        double taxPayable;

        // Calculate tax payable
        taxPayable = (int) ((cost * taxRate) * 100) / 100.0;

        // Output tax payable
        System.out.println("Tax Payable = £" + taxPayable);
    }
}
