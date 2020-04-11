package StringPrograms;
import java.util.Scanner;
//WAJP to print the frequency of each character in a given string.
public class MainStr7 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scn.nextLine();		//raghugbr@gmail.com
		int count[]=new int[128];
		for (int i = 0; i <str.length(); i++) 
		{
			char ch=str.charAt(i);
			count[ch]++;
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]!=0)
				System.out.println((char)i+"-->"+count[i]);
		}
	}
}
