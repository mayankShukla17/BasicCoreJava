package MultiThreading;
public class MainThread2 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread();
		System.out.println(t1);		//target =null name-Thread-0
		Thread t2=new Thread("Raghu");
		System.out.println(t2);		//target =null name-Raghu
		Runnable r=new MyRunnable();
		Thread t3=new Thread(r);
		System.out.println(t3);		//target=r name-Thread-1
		System.out.println("------------------------");
		Thread t4=new Thread(r,"Suresh");
		System.out.println(t4);		//target=r name=Suresh
	}
}
