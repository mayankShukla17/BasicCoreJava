import java.util.Scanner;

/*
 * Wajp to convert the array into zigzag pattern.
*/
public class MainProgram5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the string.");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
	}
}
