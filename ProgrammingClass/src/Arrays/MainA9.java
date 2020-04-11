package Arrays;

/*
 * Wajp to define a method to return how many even no & odd no present in the array.
*/
public class MainA9 
{
	public static void main(String[] args) 
	{
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read Array");
		int a[]=ao.readArr();
		System.out.println("Entered Array");
		ao.dispArr(a);
		int count[]=ao.countEO(a);
		System.out.println("No of even no."+count[0]);
		System.out.println("No of odd no."+count[1]);
	}
}
