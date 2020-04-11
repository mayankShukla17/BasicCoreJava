package Strings;
public class MainRunner9 
{
	public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder("Raghu");
		StringBuilder s2=new StringBuilder("Raghu");
		StringBuilder s3=new StringBuilder("Rahul");		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
