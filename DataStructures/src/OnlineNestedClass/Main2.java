package OnlineNestedClass;
public class Main2 
{
	public static void main(String[] args) 
	{
		class MyClass implements MyInteface
		{
			@Override
			public String getString() {
				return "Raghu";
			}
		}
		MyInteface m1=new MyClass();
		System.out.println(m1.getString());

		MyInteface m2=new MyInteface() 
		{
			@Override
			public String getString() {
				return "Shishira";
			}
		};
		System.out.println(m2.getString());

		MyInteface m3=()->{return "Shishira";};
		System.out.println(m3.getString());

		MyInteface m4=()->"Girish";
		System.out.println(m4.getString());
	}
}
