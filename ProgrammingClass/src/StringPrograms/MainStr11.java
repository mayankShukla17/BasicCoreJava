package StringPrograms;
import java.util.Scanner;
//WAJP to Check the given string is substring of main string or not
//I/P:-s1-Chitradurga is a fort city. s2:-durga
public class MainStr11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the main string");
		String s1=sc.nextLine();
		System.out.println("Enter the substring");
		String s2=sc.nextLine();
		boolean rs=isSubString(s1,s2);
		if(rs)
			System.out.println("YES Substring");
		else
			System.out.println("NO Not Substring");
	}

	public static boolean isSubString(String s1, String s2) 
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		for (int i = 0; i < c1.length; i++) 
		{
			int j=0;
			int k=i;
			while(k<c1.length&&j<c2.length&&c1[k]==c2[j])
			{
				k++;
				j++;
			}
			if(j==c2.length)
				return true;
		}
		return false;
	}
}
