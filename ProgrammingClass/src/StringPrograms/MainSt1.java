package StringPrograms;
//WAJP define a method to count and return how many times specified character present in the given String.
import java.util.Scanner;
public class MainSt1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		int c=countChar(st,ch);
		System.out.println(c);
	}

	public static int countChar(String st, char ch) 
	{
		int count=0;
		for (int i = 0; i <st.length(); i++) 
		{
			char c=st.charAt(i);
			
			if(ch==st.charAt(i))	//if(ch==c)
				count++;
		}
		return count;
	}
}
