package src;
public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 100;

    public SavingsAccount(int accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance to maintain minimum requirement.");
        }
    }
}
