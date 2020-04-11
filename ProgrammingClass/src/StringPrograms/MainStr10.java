package StringPrograms;
import java.util.Arrays;
import java.util.Scanner;
//WAJP to check two strings are anagram or not.
//I/P:-Act/Cat,Listen/Silent,God/Dog,Debite Card/Bad Credite,Keep/Peek,Mother in Law/Hitler woman,Anagram/Gram Ana
public class MainStr10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String st1=sc.nextLine();
		System.out.println("Enter the second string");
		String st2=sc.nextLine();
		boolean rs=isAanagram(st1,st2);
		if(rs)
			System.out.println("String is Anagram");
		else 
			System.out.println("String is not a Anagram");
	}

	public static boolean isAanagram(String st1,String st2)
	{
		//Using methods
		st1=st1.replace(" ","");
		st2=st2.replace(" ","");

		st1=st1.toLowerCase();
		st2=st2.toLowerCase();

		char c1[]=st1.toCharArray();
		char c2[]=st2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		return Arrays.equals(c1,c2);
		
		
		//ANOTHER WAY
		//		int count[]=new int[26];
		//		for (int i = 0; i < st1.length(); i++) 
		//		{
		//			char ch=st1.charAt(i);
		//			if(ch>='A'&&ch<='Z')
		//				count[ch-65]++;
		//			else if(ch>='a'&&ch<='z')
		//				count[ch-97]++;
		//		}
		//		for (int i = 0; i < st2.length(); i++) 
		//		{
		//			char ch=st2.charAt(i);
		//			if(ch>='A'&&ch<='Z')
		//				count[ch-65]--;
		//			else if(ch>='a'&&ch<='z')
		//				count[ch-97]--;
		//		}
		//		for (int i = 0; i < count.length; i++) 
		//		{
		//			if(count[i]!=0)
		//				return false;
		//		}
		//		return true;
	}
}
