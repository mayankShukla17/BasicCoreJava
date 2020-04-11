package OnlineNestedClass;
public class Student 
{
	public static void main(String[] args) 
	{
		Object obj1=new Object();

		System.out.println(obj1);

		Object obj2=new Object() 
		{
			@Override
			public String toString() {
				return "Jspiders";
			}
		};
		System.out.println(obj2);

		Object obj3=new Object() 
		{
			int x=200;
			@Override
			public String toString() {
				return "Qspiders";
			}

			@Override
			public int hashCode() {
				return x;
			}
		};
		System.out.println(obj3);
		//System.out.println(obj3.x);
		System.out.println(obj3.hashCode());
	}
}
