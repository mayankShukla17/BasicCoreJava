package OnlineNestedClass;
public class MainRun1 
{
	public static void main(String[] args) 
	{
		class MyComparable implements Comparable 	//Local Inner Class
		{
			@Override
			public int compareTo(Object o) 
			{
				return 20;
			}
		}

		Comparable com=new MyComparable();
		System.out.println(com.compareTo(null));

		Comparable c1=new Comparable()	
		{
			@Override
			public int compareTo(Object o) 
			{
				return 450;
			}
		}; 		//Anonymous Class

		Thread t1=new Thread() 
		{
			@Override
			public void run() 
			{
				for (int i = 0; i <10; i++) 
				{
					System.out.println("Raghu");
				}
			}
		};
		
		t1.start();
		
		Thread t2=new Thread()
		{
			@Override
			public void run() 
			{
				for (int i = 0; i <10; i++) 
				{
					System.out.println("Shishira");
				}
			}
		};
		t2.start();
	}
}
