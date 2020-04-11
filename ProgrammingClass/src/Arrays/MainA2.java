package Arrays;

/*
 * Wajp to read n elements from the user & print biggest among those elements. 
*/

import java.util.Scanner;

public class MainA2 
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
		int big=ar[0];
		for (int j = 0; j < ar.length; j++) 
		{
			if (ar[j]>big) 
			{
				big=ar[j];
			}
		}
		System.out.println(" Biggest no is " + big);
	}
}
