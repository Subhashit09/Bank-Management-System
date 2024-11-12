package src;
import java.util.HashMap;

public class Bank {
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private int accountCounter = 1001;

    public int createAccount(String name, double initialDeposit, String type, String password) {
        Account account;
        if (type.equalsIgnoreCase("Savings")) {
            account = new SavingsAccount(accountCounter, name, initialDeposit);
        } else if (type.equalsIgnoreCase("Current")) {
            account = new CurrentAccount(accountCounter, name, initialDeposit);
        } else {
            System.out.println("Invalid account type.");
            return -1;
        }
    
        account.setPassword(password);  // Set user-defined password
        accounts.put(accountCounter, account);
        System.out.println("Account created successfully. Account Number: " + accountCounter);
        return accountCounter++;
    }
    

    public void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount, String password) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            if (account.validatePassword(password)) {
                account.withdraw(amount);
            } else {
                System.out.println("Invalid password. Withdrawal denied.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }
    

    public void checkBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Current balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
