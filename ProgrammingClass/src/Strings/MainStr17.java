package Strings;

/*
 * Wajp to display no of characters present in each word.
*/
import java.util.Scanner;

public class MainStr17 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			String w="";
			while(i<ch.length && ch[i]!=' ') 
			{
				w=w+ch[i];
				i++;
			}
			if(w.length()>0)
				System.out.println(w+"-->"+w.length());
		}
	}
}
