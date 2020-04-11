package Strings;
public class MainRunner6 
{
	public static void main(String[] args) 
	{
		String s1="Jspiders and Qspiders";
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.subSequence(1,8));
		String s2="RAGHU";
		char ch[]=s2.toCharArray();	//{'R','A','G','H','U'}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('S'));
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.lastIndexOf('s'));
	}
}
