package MultiThreading;

public class Arithmetic {
	int a;
	int b;
	public Arithmetic(int a,int b) {
		this.a=a;
		this.b=b;
	}
	synchronized void add() {
		System.out.println("First value is: " + a);
		System.out.println("Second value is: " + b);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("Sum is: " + (a+b));
	}
	synchronized void update() {
		a=a+10;
		b=b+20;
	}
}

