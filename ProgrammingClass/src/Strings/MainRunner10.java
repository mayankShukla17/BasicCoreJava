package Strings;
public class MainRunner10 
{
	public static void main(String[] args) 
	{
		String s1="Jspiders";
		String s2=new String("Qspiders");
		System.out.println(s2);
//		Anonymous object (no reference)
		System.out.println("Java".lastIndexOf('a'));
//		Convert String to StringBuilder
		StringBuilder sb1=new StringBuilder(s1);
//		Convert StringBuilder to String
		String s3=new String(sb1);
		String s4=sb1.toString();
		System.out.println(s3);
		System.out.println(s4);
	}
}
