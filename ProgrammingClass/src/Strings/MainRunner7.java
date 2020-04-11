package Strings;
public class MainRunner7 
{
	public static void main(String[] args) 
	{
		String s1="Jspiders and Qspiders";
		String s2=s1.substring(3);
		System.out.println(s2);
		String s3=s1.substring(3,8);
		System.out.println(s3);
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.substring(s1.indexOf('s')+1).indexOf('s')+s1.indexOf('s')+1);
	}
}
