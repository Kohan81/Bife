package exam.q2;

import java.util.Scanner;

/**
 * Created by Eugene
 * create on 11/12/2025
 * Program description:
 */

/**
 * 2. Create a Main class to:
 * a. Create one BankAccount object.
 * b. Perform a series of deposits and withdrawals, including at least one invalid operation.
 * c. Display the account details after each operation.
 * 3. Code must:
 * a. Use proper encapsulation.
 * b. Be well commented.
 * c. Demonstrate validation and feedback to the user.
 */
public class Main {
    public static void main(String[] args) {

        char answer = 'y';
        BankAccount bankAccount = new BankAccount("Eugene", 0.00);

        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.println("Enter deposit amount:");
            bankAccount.deposit(keyboard.nextDouble());
            bankAccount.displayAccount();

            System.out.println( "Enter withdraw amount:");
            bankAccount.withdraw(keyboard.nextDouble());
            bankAccount.displayAccount();

            System.out.println("Do you want to continue? (y/n)");
            answer = keyboard.next().charAt(0);
        }while (answer == 'y');{

        }
    }
}
