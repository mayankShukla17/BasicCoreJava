package Strings;

/*
 * Wajp to count how many times second string is present in first string.
*/
import java.util.Scanner;

public class MainStr21 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string. ");
		String st1=sc.nextLine();
		System.out.println("Enter the second  string. ");
		String st2=sc.nextLine();
		
		int count=countSubString(st1,st2);
		System.out.println("Yes "+st2 +"-->"+count);
	}

	static int countSubString(String st1, String st2) 
	{
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
		int count=0;
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
				count++;
				i=k-1;
		}
		return count;
	}
}
