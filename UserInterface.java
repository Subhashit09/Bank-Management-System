package src;
import java.util.Scanner;

public class UserInterface {
    private Bank bank;
    private Scanner scanner;

    public UserInterface() {
        bank = new Bank();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank Management System.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void createAccount() {
        System.out.print("Enter name: ");
        scanner.nextLine(); 
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        System.out.print("Enter account type (Savings/Current): ");
        scanner.nextLine();
        String type = scanner.nextLine();
        System.out.print("Set your account password: ");
        String password = scanner.nextLine();
    
        bank.createAccount(name, initialDeposit, type, password);
    }
    

    private void deposit() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        bank.deposit(accountNumber, amount);
    }

    private void withdraw() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter account password: ");
        scanner.nextLine(); // Consume newline
        String password = scanner.nextLine();
    
        bank.withdraw(accountNumber, amount, password);
    }
    

    private void checkBalance() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        bank.checkBalance(accountNumber);
    }
}
