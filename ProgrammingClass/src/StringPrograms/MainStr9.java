package StringPrograms;
import java.util.Scanner;
//WAJP to define method to return True and False if the string is panagram.
//All 26 letters must be present in the string.
//I/P:-The quick brown fox jumps over a lazy dog.
public class MainStr9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		boolean rs=isPanagram(st);
		if(rs)
			System.out.println("String is Panagram");
		else 
			System.out.println("String is not a Panagram");
	}

	public static boolean isPanagram(String st) 
	{
		//Using methods
		if(st.length()<26)
			return false;
		for(char c1='A',c2='a';c1<='Z';c1++,c2++)
		{
			if(st.indexOf(c1)==-1&&st.indexOf(c2)==-1)
				return false;
		}
		return true;
		
		//ANOTHER WAY 
//		int count[]=new int[26];
//		for (int i = 0; i < st.length(); i++) 
//		{
//			char ch=st.charAt(i);
//			if(ch>='A'&&ch<='Z')
//				count[ch-65]++;
//			else if(ch>='a'&&ch<='z')
//				count[ch-97]++;
//		}
//		for (int i = 0; i < count.length; i++) 
//		{
//			if(count[i]==0)
//				return false;
//		}
//		return true;
	}
}
