package Strings;
public class MainRunner2 
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		Sample s2=new Sample();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
		Simple si1=new Simple();
		Simple si2=new Simple();
		System.out.println(si1.equals(si2));
		System.out.println(si2.equals(si1));
		Employee e1=new Employee(123,"Rajesh",57474);
		Employee e2=new Employee(124,"Rakesh",87475);
		System.out.println(e1.equals(e2));
	}
}
