package Strings;

/*
 * Wajp to convert every word first character capital and remaining letters small.
*/
import java.util.Scanner;

public class MainStr13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if (i==0 && ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else
			{
				if(ch[i]>='A' && ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
		}
		st=new String(ch);
		System.out.println(st);
		
//		String str=new String(ch);
//		System.out.println(str);
		
//		System.out.println(ch);
	}
}
