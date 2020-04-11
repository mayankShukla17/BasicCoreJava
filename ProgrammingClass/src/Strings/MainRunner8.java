package Strings;
public class MainRunner8 
{
	public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder();
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("RAGHU");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("GB");
		System.out.println(s1);
		s1.append("Jspiders and Qspiders");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.deleteCharAt(s1.indexOf("J"));
		System.out.println(s1);
		System.out.println(s1.reverse());
		System.out.println(s1);
	}
}
