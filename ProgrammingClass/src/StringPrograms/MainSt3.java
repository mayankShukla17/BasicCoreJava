package StringPrograms;
//WAJP convert all the character String to lower case.
public class MainSt3 
{
	public static void main(String[] args) 
	{
		String str="MAYANK";
		String res="";
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				ch=(char)(ch+32);
			res=res+ch;
		}
		System.out.println(res);
		
		//ANOTHER WAY
//		String str="MAYANK";
//		char ch[]=str.toCharArray();
//		for (int i = 0; i < ch.length; i++) 
//		{
//			if(ch[i]>='A'&&ch[i]<='Z')
//				ch[i]=(char)(ch[i]+32);
//		}
//		System.out.println(new String(ch));
	}
}
