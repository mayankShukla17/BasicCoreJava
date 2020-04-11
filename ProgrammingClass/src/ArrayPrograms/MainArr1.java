package ArrayPrograms;
import java.util.Scanner;
//WAJP to find biggest element from the given 2 array without merging and sorting
public class MainArr1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("1nd Array");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("2nd Array");
		for (int i = 0; i <b.length; i++) 
		{
			b[i]=sc.nextInt();
		}
		int rs=getBiggest(a, b);
		System.out.println(rs);
	}
	public static int getBiggest(int a[],int b[])
	{
		int big=0;
		if(a[0]>b[0])
			big=a[0];
		else
			big=b[0];
		for (int i = 1;i<a.length|| i < b.length; i++) 
		{
			if(i<a.length&&a[i]>big)
				big=a[i];
			if(i<b.length&&b[i]>big)
				big=b[i];
		}
		return big;
	}
}
