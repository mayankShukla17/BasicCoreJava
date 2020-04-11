package FileHandling;

public class MainT3 {
	public static void main(String[] args) {
		Arithmetic a = new Arithmetic(20, 30);
		Thread t1 = new Thread() {
			public void run() {
				a.add();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				a.update();
			}
		};
		t1.start();
		t2.start();
	}

}
