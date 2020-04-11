package Arrays;

/*
 * Wajp to define a method to return sum of special two digit no present in  the array.
*/
public class MainA13 
{
	public static void main(String[] args) 
	{
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read Array ");
		int a[]=ao.readArr();
		System.out.println("Entered Array ");
		ao.dispArr(a);
		int sum=ao.sumSpecial(a);
		System.out.println("Sum of special 2 digit nos "+sum);
	}
}
