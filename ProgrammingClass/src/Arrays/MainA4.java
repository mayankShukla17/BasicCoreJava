package Arrays;

/*
 * Wajp to count how many +ive and -ive elements present in the array.
*/
import java.util.Scanner;

public class MainA4 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter how many values you have. ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println(" Enter " + n + " values. ");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		int pCount=0,nCount=0;
		for (int j = 0; j < ar.length; j++) 
		{
			if (ar[j]>0)
				pCount++;
			else 
				nCount++;
		}
		System.out.println(" Positive values " + pCount);
		System.out.println(" Negative values " + nCount);
	}
}
