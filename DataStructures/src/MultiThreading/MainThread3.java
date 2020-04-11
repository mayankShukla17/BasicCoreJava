package MultiThreading;
public class MainThread3 
{
	static void display()
	{
		for (int i = 0; i <10; i++) 
		{
			System.out.println(i);
			if(i==5)
			{
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}

	static void print()
	{
		for (int i=65; i<=90;i++) 
			System.out.println((char)i);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		//display();
		//print();
		
		Thread t1=new DispThread();
		
		Thread t2=new PrintThread();
		
		t1.start();
		//t1.start(); 	//IllegalThreadStateException
		t2.start();
		
		System.out.println("Main Method End");
	}
}
