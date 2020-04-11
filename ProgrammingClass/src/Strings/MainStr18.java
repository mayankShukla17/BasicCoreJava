package Strings;

/*
 * Wajp to display biggest(longest) word present in the sentence.
*/
import java.util.Scanner;

public class MainStr18 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string. ");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String bw="";
		for (int i = 0; i < ch.length; i++) 
		{
			String w="";
			while(i<ch.length && ch[i]!=' ') 
			{
				w=w+ch[i];
				i++;
			}
			if(bw.length()<w.length())
				bw=w;
		}
		System.out.println(bw);
	}
}
