package FileHandling;

public class MainRunner {
	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		Sample s1 = new Sample();
		class YourThread extends Thread{
			public void run() {
				s1.display();
			}
		}
		
		class MyThread extends Thread{
			public void run() {
				s1.write();
			}
		}
		
		YourThread yt = new YourThread();
		MyThread mt = new MyThread();
		yt.start();
		mt.start();
		
		System.out.println(s1.b);
		System.out.println(Sample.a);
		System.out.println("Main Method End");
	}

}
