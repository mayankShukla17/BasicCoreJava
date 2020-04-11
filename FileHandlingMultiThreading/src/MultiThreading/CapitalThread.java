package FileHandling;

public class CapitalThread extends Thread{
	public void run() {
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+65));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);;
			}
		}
	}
}
