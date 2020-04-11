package MultiThreading;
public class MainThread1 
{
	static void display()
	{
		System.out.println("I am Display");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		display();
		Thread t2=new Thread();
		System.out.println(t2);		//t2.toString
		System.out.println(t2.toString());
		System.out.println("------------------------");
		Thread t3=new Thread("Jspiders");
		System.out.println(t3);
		System.out.println(t3.getName());
		t3.setName("Rspiders");
		System.out.println(t3);
	}
}
