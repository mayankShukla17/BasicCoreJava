package Virtusa;
public class LargestSubsetSum
{
	static int getMaximumSumWithLCMN(int N) 
	{ 
		int sum = 0; 
		int LIM = (int)Math.sqrt(N); 
		for (int i = 1; i <= LIM; i++) 
		{ 
			if (N % i == 0) 
			{ 
				if (i == (N / i)) 
					sum += i; 
				else
					sum += (i + N / i); 
			} 
		} 
		return sum; 
	} 
	public static void main(String[] args) 
	{ 

		int N []= {2,4};
		for (int i = 0; i < N.length; i++) 
		{
			System.out.println(getMaximumSumWithLCMN(N[i]));	
		} 
	} 
} 
