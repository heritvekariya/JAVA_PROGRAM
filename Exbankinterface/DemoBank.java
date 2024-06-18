package Exbankinterface;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount account = new BankAccount("9316156136",1000);
	     System.out.println("Initial Balance: " + account.getBalance());
	     account.deposit(500);
	     System.out.println("Balance after deposit: " + account.getBalance());
	     account.withdraw(200);
	     System.out.println("Balance after withdrawal: " + account.getBalance());
	     account.printTransactions();
	}

}
