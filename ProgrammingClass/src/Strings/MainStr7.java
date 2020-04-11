package Strings;

/*(V.V.V.IMPORTANT)
 * Wajp to check palindrome is possible or not by arranging the characters of user entered string.
*/
import java.util.Scanner;

public class MainStr7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		boolean rs=isPalindromePossible(st);
		if(rs)
			System.out.println("Can possible to do palindrome");
		else
			System.out.println("Not possible to do palindrome");
	}

	static boolean isPalindromePossible(String st) 
	{
		int count[]=new int[128];
		for (int i = 0; i < st.length(); i++) 
		{
			char ch=st.charAt(i);
			count[ch]++;
		}
		int odd=0;
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]%2==1)
				odd++;
			if(odd>1)
				return false;
		}
		return true;
	}
}
