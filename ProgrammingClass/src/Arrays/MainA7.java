package Arrays;

/*
 * Wajp to merge two array elements into single array.
*/
public class MainA7 
{
	public static void main(String[] args) 
	{
		ArrayOperation ao= new ArrayOperation();
		System.out.println(" Enter first array. ");
		int a[]=ao.readArr();
		System.out.println(" Enter second array. ");
		int b[]=ao.readArr();
		
		System.out.println(" Entered first array. ");
		ao.dispArr(a);
		System.out.println(" Entered second array. ");
		ao.dispArr(b);
		
		int c[]=ao.merge(a,b);
		System.out.println(" After merge ");
		ao.dispArr(c);
	}
}
