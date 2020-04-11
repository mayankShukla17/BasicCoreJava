package Strings;

/*
 * Wajp to display how many vowels present in each word
*/
import java.util.Scanner;

public class MainStr16 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String st=sc.nextLine();
		
		String v="AEIOUaeiou";
		int c=0;
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			int count=0;
			c++;
			while(i<ch.length && ch[i]!=' ') 
			{
				if(v.contains(ch[i]))
					count++;
			}
			System.out.println(c+" word has " +count+" vowels ");
		}
	}
}
