package src;
public class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
