package MultiThreading;
public class MainRunner 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Bank b=new Bank(5000);
		Thread t1=new Thread() 
		{
			@Override
			public void run() 
			{
				b.withDraw(8000);
			}
		};
		Thread t2=new Thread() 
		{
			@Override
			public void run() 
			{
				b.deposit(4000);
			}
		};
		t1.start();
			Thread.sleep(5000);
		t2.start();
	}
}
