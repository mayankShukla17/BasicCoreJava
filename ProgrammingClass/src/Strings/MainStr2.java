package Strings;

/*
 * Wajp to calc the sum of digits in the string.
*/
import java.util.Scanner;

public class MainStr2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		int sum=0;
		for (int i = 0; i < st.length(); i++) 
		{
			char ch=st.charAt(i);
			if (ch>'0'&&ch<='9') 
				sum=sum+(ch-48);	
		}
		System.out.println(sum);
	}
}
