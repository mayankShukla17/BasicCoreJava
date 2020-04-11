package OnlineNestedClass;
public class Main5 
{
	public static void main(String[] args) 
	{
		Runnable r=()->{
			for(int i=65;i<=90;i++)
				System.out.println((char)i);
			};
			
		Comparable<Integer> com=(obj)->obj.hashCode();
	}
}
