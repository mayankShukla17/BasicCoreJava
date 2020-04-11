package Strings;

/*
 * Wajp to display the smallest word present in the sentence.
*/
import java.util.Scanner;

public class MainStr19 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String sw=st;
		for (int i = 0; i < ch.length; i++) 
		{
			String w="";
			while(i<ch.length && ch[i]!=' ') 
			{
				w=w+ch[i];
				i++;
			}
			if(sw.length()>w.length())
				sw=w;
		}
		System.out.println(sw);
	}
}
