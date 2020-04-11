package OnlineNestedClass;
public class Outer 
{
	static class Nest
	{
		int x=10;
		static int y=20;
		void m1()
		{
			
		}
		static void m2()
		{
			
		}
	}
	void display()
	{
		System.out.println(Nest.y);
		Nest.m2();
		Nest n1=new Nest();
		System.out.println(n1.x);
		n1.m2();
	}
}
