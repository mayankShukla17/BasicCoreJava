package Arrays;

/*
 * Wajp to define a method to return how many +ive & -ive no present in the array.
*/
public class MainA10 
{
	public static void main(String[] args) 
	{
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read array.");
		int a[]=ao.readArr();
		System.out.println("Display Array");
		ao.dispArr(a);
		
		int count[]=ao.countPN(a);
		System.out.println("Positive numbers "+count[0]);
		System.out.println("Negative numbers "+count[1]);
	}
}
