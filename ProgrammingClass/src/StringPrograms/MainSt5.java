package StringPrograms;
//Convert all vowel in capital constraint into small.
public class MainSt5 
{
	public static void main(String[] args) 
	{
		String str="MAYANK";
		String res="";
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					ch=(char)(ch+32);
			}
			res=res+ch;
		}
		System.out.println(res);

		//ANOTHER WAY
//		String str="MAYANK";
//		char ch[]=str.toCharArray();
//		for (int i = 0; i < ch.length; i++) 
//		{
//			if(ch[i]>='A'&&ch[i]<='Z')
//			{
//				if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
//					ch[i]=(char)(ch[i]+32);
//			}
//		}
//		System.out.println(new String(ch));
	}
}
