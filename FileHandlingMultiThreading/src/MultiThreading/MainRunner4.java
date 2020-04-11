package FileHandling;

public class MainRunner4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(); //it targets run method of Thread class
		System.out.println(t1);
		Thread t2 = new Thread("MKS");
		System.out.println(t2); //it targets run method of Thread class
		
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				
			}
		}
		Thread t3 = new Thread (new MyRunnable()); //it targets run method of Runnable Interface
		Thread t4 = new Thread(new MyRunnable(),"MKS"); //it targets run method of Runnable Interface
		System.out.println(t3);
		System.out.println(t4);
	}

}
