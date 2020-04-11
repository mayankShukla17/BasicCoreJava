package StringPrograms;
import java.util.Scanner;
/*WAJP read the sentence from the user count and display how many
 * vowels consonants digits, capital letters, small letters, special 
 * characters present in the sentence.
 */
public class MainSt2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		int vc=0,cc=0,dc=0,uc=0,lc=0,spc=0;
		for (int i = 0; i <st.length(); i++) 
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					vc++;
				else
					cc++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
			else if(ch>='0'&&ch<='9')
				dc++;
			else
				spc++;
		}
		System.out.println("Vowels "+vc);
		System.out.println("Consonants "+cc);
		System.out.println("Upper Case "+uc);
		System.out.println("Lower Case "+lc);
		System.out.println("Digits "+dc);
		System.out.println("Special "+spc);
	}
}
