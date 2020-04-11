package Arrays;

/*
 * Wajp to find smallest element from the array.
*/

import java.util.Scanner;

public class MainA3 
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
		int small=ar[0];
		for (int j = 0; j < ar.length; j++) 
		{
			if (ar[j]<small) 
			{
				small=ar[j];
			}
		}
		System.out.println(" Smallest no is " + small);
	}
}
