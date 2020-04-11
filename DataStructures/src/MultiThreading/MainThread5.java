package MultiThreading;
public class MainThread5 
{
	class MyRunnable implements Runnable
	{
		@Override
		public void run() 
		{
			for (int i =1;i<=9;i++) 
			{
				System.out.println(Thread.currentThread().getName()+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Runnable r1=new MainThread5().new MyRunnable();

		Thread t1=new Thread(r1,"Jspiders");
		Thread t2=new Thread(r1,"Qspiders");

		t1.start();
		t2.start();
	}
}
