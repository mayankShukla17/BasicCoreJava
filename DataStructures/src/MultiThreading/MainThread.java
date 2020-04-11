package MultiThreading;
public class MainThread 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread();
		System.out.println("Name: "+t1.getName());
		System.out.println("Id: "+t1.getId());
		System.out.println("Priority: "+t1.getPriority());
		t1.setName("Raghu");
		t1.setPriority(8);
		System.out.println("Name: "+t1.getName());
		System.out.println("Id: "+t1.getId());
		System.out.println("Priority: "+t1.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
	}
}
