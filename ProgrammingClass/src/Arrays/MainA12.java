package Arrays;

/*
 * Wajp to define a method to return how many palindrome no present in the array. 
*/
public class MainA12 
{
	public static void main(String[] args) 
	{
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read Array ");
		int a[]=ao.readArr();
		System.out.println("Entered Array ");
		ao.dispArr(a);
		int count=ao.countPalindrome(a);
		System.out.println("No of Palindrome nos "+count);
	}
}
