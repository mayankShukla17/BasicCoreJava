package FileHandling;

public class SmallThread extends Thread{
	public void run() {
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+97));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);;
			}
		}
	}
}
