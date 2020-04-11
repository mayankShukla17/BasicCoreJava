package StringPrograms;
import java.util.Scanner;
//WAJP to reverse the string(Sentence).
public class MainStr4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String rs="";
		for (int i =ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0&&ch[i]!=' ')
				i--;
			int j=i+1;
			while(j<=k)
			{
				rs+=ch[j];
				j++;
			}
			if(i>=0)
				rs+=ch[i];
		}
		System.out.println(rs);
	}
}
