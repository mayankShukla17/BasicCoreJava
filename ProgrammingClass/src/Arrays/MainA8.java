package Arrays;

/*
 * Wajp to define a method and return how many prime no present in the array.
*/
public class MainA8 
{
	public static void main(String[] args) 
	{
		ArrayOperation ao= new ArrayOperation();
		System.out.println(" Enter the array. ");
		int a[]=ao.readArr();
		System.out.println("Entered Array.");
		ao.dispArr(a);
		int pc=ao.countPrime(a);
		System.out.println("No of prime no."+pc);
	}
}
