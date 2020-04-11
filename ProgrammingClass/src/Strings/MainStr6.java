package Strings;

/*
 * Wajp to check user entered strings are anagram or not.
 * I/P: s1="Keep",|"Act",|"Silent Cat",|"Debit Card",|"Mother In Law"
 * 		s2="Peek",|"Cat",|"Listen Act",|"Bad Credit",|"Hitler Woman"
 */
import java.util.Scanner;

public class MainStr6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String st1=sc.nextLine();
		System.out.println("Enter the second string");
		String st2=sc.nextLine();
		boolean rs=isAnagram(st1,st2);
		if(rs)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

	static boolean isAnagram(String st1, String st2) 
	{
		int count1[]=new int[26];
		st1=st1.toLowerCase();
		for (int i = 0; i < st1.length(); i++) 
		{
			char ch=st1.charAt(i);
			if(ch>='a'&&ch<='z')
				count1[ch-97]++;
		}
		int count2[]=new int[26];
		st2=st2.toLowerCase();
		for (int i = 0; i < st2.length(); i++) 
		{
			char ch=st2.charAt(i);
			if(ch>='a'&&ch<='z')
				count2[ch-97]++;
		}
		for (int i = 0; i < count1.length; i++) 
		{
			if(count1[i]!=count2[i])
				return false;
		}
		return true;
	}
}
