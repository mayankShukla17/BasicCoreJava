package OnlineNestedClass;

public class Sample 
{
	int x1=10;
	static int y1=20;
	int x=1000;
		class Demo
		{
			int x=100;
			int y1=200;
			//static int y=200;
			void m1()
			{
				System.out.println("I am m1");
				System.out.println(y1);//200
				System.out.println(Sample.y1);//20
				
				System.out.println(x1);
				Sample s1=new Sample();
				System.out.println(s1.x);
				System.out.println(x);
			}
		}
		
		void display()
		{
			Demo d1=new Demo();
			System.out.println(d1.x);
			d1.m1();
		}
}
