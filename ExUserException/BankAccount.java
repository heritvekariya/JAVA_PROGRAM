package ExUserException;

public class BankAccount {
    private String accName;
    private double balance;

    public BankAccount(String accName, double balance) {
        this.accName = accName;
        this.balance = balance;
    }
    public String getAccName() {
        return accName;
    }
    public void setAccName(String accName) {
        this.accName = accName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [accName=" + accName + ", balance=" + balance + "]";
    }

    // Method to withdraw amount and check balance
    public void withdraw(double amount) throws LowBalanceException {
        if (balance - amount < 1000) {
            throw new LowBalanceException("Balance after withdrawal should not be less than 1000.");
        }
        balance = balance - amount;
    }
}
