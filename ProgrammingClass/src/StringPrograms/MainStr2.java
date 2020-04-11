package StringPrograms;
/*WAJP to convert the string into Dancing String
*/
import java.util.Scanner;
public class MainStr2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String st=getDancingString(str);
		System.out.println("Dancing format:");
		System.out.println(st);
	}
	
	public static String getDancingString(String str)
	{
		String rs="";
		int find=0;
		for (int i = 0; i <str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(find==0&&ch!=' ')
			{
				if(ch>='a'&&ch<='z')
					ch=(char)(ch-32);
				find=1;
			}
			else if(ch!=' ')
			{
				if(ch>='A'&&ch<='Z')
					ch=(char)(ch+32);
				find=0;
			}
			rs=rs+ch;
		}
		return rs;
	}
}
