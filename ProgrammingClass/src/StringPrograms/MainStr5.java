package StringPrograms;
import java.util.Scanner;
//WAJP to count how many words present in the sentence
public class MainStr5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		int count=countWords(st);
		System.out.println("Number of words: "+count);
	}

	public static int countWords(String st) 
	{
		char ch[]=st.toCharArray();
		int count=0;
		for (int i =0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				count++;
		}
		return count;
	}
}
