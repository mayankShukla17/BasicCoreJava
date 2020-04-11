package StringPrograms;
import java.util.Scanner;
//WAJP to reverse the words in a sentence
//I/P:-Rama is a good boy.
public class MainStr3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String rs="";
		for (int i = 0; i < ch.length; i++) 
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
				i++;
			int j=i-1;
			while(j>=k)
			{
				rs=rs+ch[j];
				j--;
			}
			if(i<ch.length)
				rs+=ch[i];
		}
		System.out.println(rs);
	}
}
