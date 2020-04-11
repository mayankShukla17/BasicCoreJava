package FileHandling;

public class Sample {
	static int a = 10;
	int b = 20;
	void display() {
		for(int i = 1; i<=10;i++) {
			System.out.println("I am display");
			if(i==5) {
				try {
					Thread.sleep(10000, 300);
				}catch(InterruptedException e ) {
					System.out.println(e);
				}
			}
		}
	}
	void write() {
		for(int i = 1; i<=10;i++) {
			System.out.println("I am write method");
		}
	}
}
