package Arrays;

/*
 * Wajp to count & display how many odd & even elements present in the array.
*/

import java.util.Scanner;

public class MainA5 
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
		int eCount=0,oCount=0;
		for (int j = 0; j < ar.length; j++) 
		{
			if (ar[j]%2==0)
				eCount++;
			else 
				oCount++;
		}
		System.out.println(" Even values " + eCount);
		System.out.println(" Odd values " + oCount);
	}
}
