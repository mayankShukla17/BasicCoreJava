package MultiThreading;

public class Thread3 extends Thread {
	public void run() {
		for (int i = 100; i < 1000; i=i+100) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
