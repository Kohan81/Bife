package exam.q2;

/**
 * Created by Eugene
 * create on 11/12/2025
 * Program description:
 */

/**
 * Question 2 – Bank Account (Encapsulation, Simple Methods, Validation)
 * Assessment Brief
 * You are to create an Object-Oriented Bank Account system.
 * The program will allow deposits, withdrawals, and balance checking for a single account.
 * 1. Create a class called BankAccount with:
 */
public class BankAccount {

    //a. Private fields:
    //i. accountNumber (String)
    //ii. balance (double)

    private String accountNumber;
    private double balance;

    //b. Constructor:
    //i. A constructor that accepts accountNumber and an initial balance.
    //ii. If the initial balance is less than 0, set the balance to 0 and print a warning.

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

        if (balance < 0) {
            System.out.println("Invalid balance. Balance must be 0 or greater.");
            balance = 0;
        }
    }


    //c. Methods:
    //i. deposit(double amount)
    //1. If amount is less than or equal to 0, print an error and do nothing.
    //2. Otherwise, add amount to balance.

    void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Invalid amount. Amount must be greater than 0.");
        } else {
            balance += amount;
        }
    }

    //ii. withdraw(double amount)
    //1. If amount is less than or equal to 0, print an error and do nothing.
    //2. If amount is greater than balance, print “Insufficient funds” and do nothing.
    //3. Otherwise, subtract amount from balance.

    void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Invalid amount. Amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }

    //iii. getBalance()
    //1. Returns the current balance.
    double getBalance(){
        return balance;
    }

    //iv. displayAccount()
    //1. Prints the account number and balance in a user-friendly format.

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    void displayAccount(){
        System.out.println(this);
    }
}
