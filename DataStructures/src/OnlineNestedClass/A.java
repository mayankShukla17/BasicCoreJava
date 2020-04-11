package OnlineNestedClass;

public class A //outer class
{
	int x1=90;//instance
	static int y1=45;//static member

	int x=100;
	static int y=450;
	static class B
	{
		int x=10;
		static int y=45;
		void m1()
		{
			System.out.println(y1);
			A a1=new A();
			System.out.println(a1.x1);
			System.out.println(x);//10
			System.out.println(a1.x);//100
			System.out.println(y);//45
			System.out.println(A.y);//450
		}
		static void m2()
		{
			System.out.println(y1);
			A a1=new A();
			System.out.println(a1.x);
		}
	}

}
