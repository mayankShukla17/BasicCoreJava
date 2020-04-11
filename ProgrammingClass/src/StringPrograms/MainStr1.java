package StringPrograms;
import java.util.Scanner;
/*WAJP to count the digits and calc. the sum of digits present in the string.
*/
public class MainStr1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int sum=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
				sum+=ch-48;
		}
		System.out.println("Sum is: "+sum);
	}
}
