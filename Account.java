package src;
public abstract class Account {
    private int accountNumber;
    private String accountHolder;
    protected double balance;
    private String password;

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        // Initialize with a default password (can be set/changed by the user)
        this.password = "1234"; // Default or placeholder
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
