package StringPrograms;
import java.io.FileReader;
//WAJP to read the input from external file and count the word how many times it is present.
public class MainStr15 
{
	public static void main(String[] args) throws Exception 
	{
		String s1="";
		FileReader fr=new FileReader("/home/mayank/eclipse-workspace/ProgrammingClass/src/StringPrograms/story.txt");
		int in;
		while((in=fr.read())!=-1)
			s1=s1+(char)in;
		String s2="the";

		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();

		int count=0;
		for (int i = 0; i < c1.length; i++) 
		{
			int j=0;
			int k=i;
			while(k<c1.length&&j<c2.length&&c1[k]==c2[j])
			{
				k++;
				j++;
			}
			if(j==c2.length)
			{
				count++;
				i=k-1;
			}
		}
		System.out.println(count);
	}
}
