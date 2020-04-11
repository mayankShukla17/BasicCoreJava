package FileHandling;

public class Bank {
	int balance;
	public Bank(int balance) {
		this.balance=balance;
	}
	synchronized void withdraw(int amount) {
		if(balance<amount) {
			System.out.println("Balance is low.");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			withdraw(amount);
			return;
		}
		System.out.println("Withdraw successfully.");
		balance=balance-amount;
		System.out.println("Available balance is:"+balance);
	}
	synchronized void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Deposited successfully");
		System.out.println("Available balance " + balance);
		notify();
	}

}
