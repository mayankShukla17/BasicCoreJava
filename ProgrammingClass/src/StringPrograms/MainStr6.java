package StringPrograms;
//WAJP Convert every words first character to capital remaining small.
import java.util.Scanner;
public class MainStr6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		st=initCap(st);
		System.out.println(st);
	}

	public static String initCap(String st) 
	{
		char ch[]=st.toCharArray();
		for (int i =0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		return new String(ch);
	}
}
