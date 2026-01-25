package elevate_tasks;

import java.util.ArrayList;
import java.util.Scanner;

// BankAccount class
class BankAccount {

    // 1. Private variables
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private ArrayList<String> transactionHistory;

    // 2. Constructor for initialization
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        transactionHistory = new ArrayList<>();
        transactionHistory.add("Account opened with balance: " + initialBalance);
    }

    // 3. Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // 4. Deposit method
    public void deposit(double amount) {
        // 5. Business rule validation
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // 4. Withdrawal method
    public void withdraw(double amount) {
        // 5. Business rule validation
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount);
            System.out.println("Withdrawal successful");
        }
    }

    // 7. Transaction history
    public void showTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input for account creation
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // 6. Create account object
        BankAccount account = new BankAccount(accNo, name, balance);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 4:
                    account.showTransactionHistory();
                    break;

                case 5:
                    System.out.println("Exiting application");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
