public class code1 
{
	public static void high(int a[],int n,int k)
	{
		int sum=0;
		int p=0;
		int ar[]=new int [1000];
		for (int i = 0; i <n-1; i++)
		{
			sum=a[i]+a[i+1]*k;
		}
		ar[p++]=sum;
		System.out.print(sum+"\n");
		System.out.println(ar[0]);
		//	System.out.println(a[in]+","+a[in+1]);
	}
	public static void main(String[] args) 
	{
		int a[]= {4,5,6,7};
		int n=a.length;
		int k=3;
		high(a,n,k);
	}

}
