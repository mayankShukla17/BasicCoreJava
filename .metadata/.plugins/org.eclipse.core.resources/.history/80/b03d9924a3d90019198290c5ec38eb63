package Strings;

/*
 * Wajp to check the string is palindrome or not without using reverse method.
*/
import java.util.Scanner;

public class MainStr9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		boolean rs=isPlindrome(st);
		if(rs)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	static boolean isPlindrome(String st) 
	{
		int i=0,l=st.length()-1;
		while(i<l) 
		{
			if(st.charAt(i)!=st.charAt(l))
				return false;
			i++;
			l++;
		}
		return true;
	}
}
