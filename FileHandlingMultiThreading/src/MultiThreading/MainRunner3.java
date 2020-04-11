package FileHandling;

public class MainRunner3 {
	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println(t);
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getId());
		
		t1.setName("MKS");
		t1.setPriority(5);
		System.out.println(t1);
		
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
	}

}
