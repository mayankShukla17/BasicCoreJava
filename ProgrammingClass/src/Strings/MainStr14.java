package Strings;

/*
 * Wajp to swap every word first character with last character.
*/
import java.util.Scanner;

public class MainStr14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if (i==0 && ch[i]!=' '||ch[i]!=' ' && ch[i-1]==' ') 
			{
				int k=i;
				while(i<ch.length && ch[i]==' ') 
				{
					i++;
				}
				char temp=ch[k];
				ch[k]=ch[i-1];
				ch[i-1]=temp;
			}
		}
		st=new String(ch);
		System.out.println(st);
	}
}
