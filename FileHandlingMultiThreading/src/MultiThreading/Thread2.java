package FileHandling;

public class Thread2 extends Thread{
	public void run() {
		for (int i = 10; i < 100; i=i+10) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
