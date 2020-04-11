package Virtusa;
public class WeightedString 
{
	public static String smallestString(long weight)
	{
		long ar[]=new long[26];
		ar[0]=1;
		for (int i =1; i < ar.length; i++) 
		{
			//ar[i]=(i+2)*ar[i-1];
			ar[i]=(2*ar[i-1])+ar[i-1];
		}
		int l=0,h=25,mid=0;
		while(true)
		{
			mid=(l+h)/2;
			if(ar[mid]<=weight&&weight<ar[mid+1])
				break;
			if(ar[mid]>weight)
				h=mid-1;
			else
				l=mid+1;
		}
		String res="";
		while(weight>0)
		{
			if(weight>=ar[mid])
			{
				weight=weight-ar[mid];
				res=(char)(mid+65)+res;
			}
			if(weight<ar[mid])
				mid--;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		long l=20;
		System.out.println(smallestString(l));
	}
}
