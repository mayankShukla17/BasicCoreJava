package FileHandling;

public class MainT2 {
	public static void main(String[] args) throws Exception{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
//		t2.join();
		t2.start();
//		t2.join(500);
		t3.start();
		Thread.sleep(400);
		t1.suspend(); // Blocked State
		
		Thread.sleep(5000);
		t1.resume(); // Blocked state to runnable state
	}
}
