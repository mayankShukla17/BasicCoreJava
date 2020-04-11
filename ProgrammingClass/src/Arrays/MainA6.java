package Arrays;
/*
 * Wajp to count how many prime no present in the array without using method.
 */
import java.util.Scanner;
public class MainA6 
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
		int count=0;
		boolean isPrime;
		for(int i=0; i<ar.length; i++)
		{
			isPrime=true;
			int j=2;
			while(j<=ar[i]/2) 
			{
				if(ar[i]%j==0) 
				{
					isPrime=false;
					break;
				}
				j++;
			}
			if(isPrime) {
				count++;
				System.out.println(ar[i]);
			}
		}
		System.out.println("Total No of Prime no in array are "+count);
	}
}



