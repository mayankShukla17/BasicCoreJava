package FileHandling;

public class MainT1 {
	public static void main(String[] args) {
		Thread t1= new Thread(new MyRunnable());
		Thread t2= new Thread(new MyRunnable(),"MKS");
		t1.start();
		t2.start();
	}

}
