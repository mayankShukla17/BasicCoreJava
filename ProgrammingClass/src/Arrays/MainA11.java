package Arrays;

/*
 * Wajp to define a method to return biggest element present in the array.
*/
public class MainA11 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read array");
		int a[]=ao.readArr();
		System.out.println("Entered the array");
		int big=ao.isBigger(a);
		System.out.println("Biggest no " +big);
	}
}
