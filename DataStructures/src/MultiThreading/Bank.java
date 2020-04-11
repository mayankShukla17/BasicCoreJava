package MultiThreading;
public class Bank
{
	int balance;
	public Bank(int balance)
	{
		super();
		this.balance=balance;
	}

	synchronized void withDraw(int amt)
	{
		if(balance>amt)
		{
			balance=balance-amt;
			System.out.println("Successfully withdraw the amount: "+amt);
			return;
		}
		System.out.println("Low Balance");
		try {
			//wait();
			wait(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		withDraw(amt);
	}

	synchronized void deposit(int amt)
	{
		balance=balance+amt;
		System.out.println("Successfully deposited ");
		System.out.println("Available Balance: "+balance);
		notify();
	}
}
