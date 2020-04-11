package StringPrograms;
//WAJP convert all character in upper case.
public class MainSt4 
{
	public static void main(String[] args) 
	{
		String str="mayank";
		String res="";
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
				ch=(char)(ch-32);
			res=res+ch;
		}
		System.out.println(res);
		
		//ANOTHER WAY
//		String str="mayank";
//		char ch[]=str.toCharArray();
//		for (int i = 0; i < ch.length; i++) 
//		{
//			if(ch[i]>='a'&&ch[i]<='z')
//				ch[i]=(char)(ch[i]-32);
//		}
//		System.out.println(new String(ch));
	}
}
