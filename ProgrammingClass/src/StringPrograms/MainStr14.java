package StringPrograms;
//WAJP to Check the given string is substring of main string or not 
//and check it is word or not (how many times it is present)
//I/P:-s1-Chitradurga is a fort city and there is a good fort. s2:-fort
import java.util.Scanner;
public class MainStr14
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the main string");
		String s1=sc.nextLine();
		System.out.println("Enter the substring");
		String s2=sc.nextLine();
		int rs=countSubStringWord(s1,s2);
		System.out.println(rs+" times it is present");
	}

	public static int countSubStringWord(String s1, String s2) 
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		int count=0;
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
			{
				if((i==0||c1[i-1]==' ')&&(k==c1.length||c1[k]==' '))
					count++;
			}
		}
		return count;
	}
}

