import java.util.Scanner;

/*
 * Wajp to find all missing elements of a range.
*/
public class MainProgram2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements you want to enter.");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the " + n + " elements.");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
	}
}
