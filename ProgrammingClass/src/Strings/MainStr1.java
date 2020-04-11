package Strings;

/*
 * Wajp to count how many vowels,consonants,upper case letter,lower case letter 
 * and digits and special characters present in the string.
*/
import java.util.Scanner;

public class MainStr1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;
		for (int i = 0; i < st.length(); i++) 
		{
			char ch=st.charAt(i);
			if (ch>='A' && ch<='Z') 
			{
				uc++;
				if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
					vc++;
				else
					cc++;
			}
			else if (ch>='a' && ch<='z') 
			{
				lc++;
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
					vc++;
				else 
					cc++;
			}
			else if (ch>='0' && ch<='9') 
			{
				dc++;
			}
			else {
				spc++;
			}
		}
		System.out.println("Number of vowels "+vc);
		System.out.println("Number of consonants "+cc);
		System.out.println("Number of small letters "+lc);
		System.out.println("Number of capital letters "+uc);
		System.out.println("Number of digits "+dc);
		System.out.println("Number of special characters "+spc);
	}
}
