package Strings;

/*
 * Wajp to check the second string is present in the first string or not.
*/
import java.util.Scanner;

public class MainStr20 
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string ");
		String st1=sc.nextLine();
		System.out.println("Enter the second string ");
		String st2=sc.nextLine();
		
		boolean rs=isSubSring(st1,st2);
		if(rs)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static boolean isSubSring(String st1, String st2) 
	{
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
		for (int i = 0; i < ch1.length; i++) 
		{
			int j=0;
			int k=i;
			while(k<ch1.length && j<ch2.length && ch1[k]==ch2[j]) 
			{
				j++;
				k++;
			}
			if(j==ch2.length)
				return true;
		}
		return false;
	}
}
