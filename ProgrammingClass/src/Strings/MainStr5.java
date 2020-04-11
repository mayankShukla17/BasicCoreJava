package Strings;

/*
 * Wajp to check user entered string is panagram or not.
 * Panagram-String which has all 26 letters atleast once irrespective of cases.
 * I/P: Fred specialized in the job of making very quaint wax toys.
 * 		The quick brown fox jumps over a lazy dog.
*/
import java.util.Scanner;

public class MainStr5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		boolean rs=isPanagram(st);
		if(rs)
			System.out.println("Panagram");
		else
			System.out.println("Not Panagram");
	}

	static boolean isPanagram(String st) 
	{
		if(st.length()<26)
			return false;
		int count[]=new int[26];
		st=st.toLowerCase();
		for (int i = 0; i < st.length(); i++) 
		{
		char ch=st.charAt(i);
		if(ch>='a'&&ch<='z')
			count[ch-97]++;
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}
}
