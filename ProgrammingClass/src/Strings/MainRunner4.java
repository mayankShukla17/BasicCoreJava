package Strings;
public class MainRunner4 
{
	public static void main(String[] args) 
	{
		String s1="Java";
		String s2="Mava";
		String s3="Java";
		String st1=new String("Java");
		String st2=new String("Mava");
		String st3=new String("Java");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1==s1);
		System.out.println(st1.equals(s1));
	}
}
