package StringPrograms;
import java.util.Scanner;
//WAJP to count the frequency of each alphabet in given string irrespective of cases
public class MainStr8 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scn.nextLine();	//AaabcABBd
		int count[]=new int[26];
		for (int i = 0; i <str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&& ch<='z')
				count[ch-97]++;
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]!=0)
				System.out.println((char)(i+65)+"-->"+count[i]);
		}
	}
}
