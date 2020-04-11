package Strings;

/*
 * Wajp to check the string is palindrome or not(using in built methods).
*/
import java.util.Scanner;

public class MainStr8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		boolean rs=isPalindrome(st);
		if(rs)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	static boolean isPalindrome(String st) 
	{
//		StringBuilder sb=new StringBuilder();
//		sb.reverse();
//		String rev=sb.toString();
		String rev=new StringBuilder(st).reverse().toString();
		return st.equals(rev);
	}
}
