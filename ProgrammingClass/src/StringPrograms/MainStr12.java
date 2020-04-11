package StringPrograms;
//WAJP count the substring how many times it is present.
//I/P:-rama is a good boy raju is a very good boy sanju is a very very good boy.
//O/P:-No of times(3 or 2)
import java.util.Scanner;
public class MainStr12 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the main string");
		String s1=sc.nextLine();
		System.out.println("Enter the substring");
		String s2=sc.nextLine();
		int rs=isSubString(s1,s2);
		System.out.println(rs+" times it is present");
	}

	public static int isSubString(String s1, String s2) 
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
				count++;
				i=k-1;
			}
		}
		return count;
	}
}

