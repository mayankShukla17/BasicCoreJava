package Strings;
public class MainRunner1 
{
	public static void main(String[] args) 
	{
		Object obj=new Object();
		System.out.println(obj); //toString() return value
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		Sample s1=new Sample();
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		Simple s2=new Simple();
		System.out.println(s2.toString());
		System.out.println(s2.hashCode());
		Employee e1=new Employee(123,"Rajesh",57474);
		Employee e2=new Employee(124,"Rakesh",87475);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
