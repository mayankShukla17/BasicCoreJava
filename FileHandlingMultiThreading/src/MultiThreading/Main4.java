package FileHandling;

public class Main4 {
	public static void main(String[] args) throws InterruptedException {
		Bank b = new Bank(3000);
		Thread t1 = new Thread() {
			public void run() {
				b.withdraw(7000);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				b.deposit(3000);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				b.deposit(3000);
			}
		};
		t1.start();
		Thread.sleep(10000);
		t2.start();
		Thread.sleep(5000);
		t3.start();
	}
}
