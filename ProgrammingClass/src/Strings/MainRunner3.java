package Strings;
public class MainRunner3 
{
	public static void main(String[] args) 
	{
		String s1=new String("Jspiders");
		String s2=new String("Qspiders");
		String s3=new String("Jspiders");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
