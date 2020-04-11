package MultiThreading;
public class MainThread7 
{
	public static void main(String[] args) throws Exception 
	{
		Runnable r1=new MainThread5().new MyRunnable();
		Thread t1=new Thread(r1,"Cat");
		Thread t2=new Thread(r1,"Mat");
		
		t1.start();
		t2.start();
		Thread.sleep(6000);
			t1.suspend();
			//t1.stop();
			//t1.destroy();
		Thread.sleep(8000);
			t1.resume();
	}
}
