package Arrays;

import java.util.Scanner;

public class ArrayOperation 
{
	int[] readArr() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values do you have. ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter " + n + " values. " );
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	
	void dispArr(int ar[]) 
	{
		for (int i = 0; i < ar.length; i++) 
		{
			if (i<ar.length-1)
				System.out.print(ar[i]+ ",");
			else
				System.out.println(ar[i]);
		}
	}
	
	int[] merge(int x[], int y[]) 
	{
		int[] z=new int[x.length + y.length];
		for (int i = 0; i < x.length; i++) 
		{
			z[i]=x[i];
		}
		for (int i = 0; i < y.length; i++) 
		{
			z[x.length+i]=y[i];
		}
		return z;
	}

	int countPrime(int[] ar) 
	{
		int count=0;
		for (int i = 0; i < ar.length; i++) 
		{
			if (isPrime(ar[i])) 
				count++;
		}
		return count;
	}

	boolean isPrime(int x) 
	{
		int i=2;
		while(i<=x/2) {
			if(x%i==0)
				return false;
			i++;
		}
		return true;
	}

	int[] countEO(int[] ar) 
	{
		int count[]= {0,0};
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]%2==0)
				count[0]++;
			else
				count[1]++;
//			count[ar[i]%2]++;
		}
		return count;
	}

	int[] countPN(int[] ar) 
	{
		int count[]= {0,0};
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]>=0)
				count[0]++;
			else
				count[1]++;
		}
		return count;
	}

	int isBigger(int[] ar) 
	{
		int big=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(big<ar[i])
				big=ar[i];
		}
		return big;
	}

	int countPalindrome(int[] ar) 
	{
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			if(isPalindrome(ar[i]))
				count++;
		}
		return count;
	}

	boolean isPalindrome(int x) 
	{
		int rev=0,n=x;
		do {
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}while(x!=0);
		return rev==n;
	}

	int sumSpecial(int[] ar) 
	{
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			if(isSpecial(ar[i]))
				sum=sum+ar[i];
		}
		return sum;
	}

	boolean isSpecial(int i) {
		int d1 = i/10;
		int d2 = i%10;
		int sum = (d1+d2)+(d1*d2);
		return sum == i;
		
//		 // Checking whether entered  
//        // number is 2 digit or not 
//        if(i < 10 || i > 99)  
//            System.out.println("Invalid Input! " + "Number should have " + "2 digits only"); 
//        else
//        {  
//            // Finding the first digit 
//            int first = i / 10;  
//              
//            // Finding the last digit 
//            int last = i % 10;  
//              
//            
//            // Finding the sum  
//            // of the digits 
//            int sum = first + last;  
//              
//            // Finding the product 
//            // of the digits 
//            int pro = first * last;  
//              
//            if((sum + pro) == i) 
//            { 
//                System.out.println(i + " is a Special" + " Two-Digit Number"); 
//            } 
//            else
//            { 
//                System.out.println(i +" is Not a Special" + " Two-Digit Number"); 
//            } 
//        } 
	}
}
