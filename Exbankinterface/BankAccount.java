package Exbankinterface;

public class BankAccount implements BankOperations {
 private String accountNumber;
 private double balance;

 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
     System.out.println("Account created with initial balance: " + initialBalance);
 }

 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount + ", New Balance: " + balance);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0) {
         if (amount <= balance) {
             balance -= amount;
             System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
         } else {
             System.out.println("Insufficient funds.");
         }
     } else {
         System.out.println("Withdrawal amount must be positive.");
     }
 }

 @Override
 public void printTransactions() {
     System.out.println("End of transaction history for account " + accountNumber);
 }

 public double getBalance() {
     return balance;
 }
}

