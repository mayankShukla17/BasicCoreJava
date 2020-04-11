package ArrayPrograms;
import java.util.Scanner;
public class MainMat6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Matrix mt=new Matrix();
		System.out.println("Read Matrix: ");
		int a[][]=mt.readMat();
		System.out.println("Entered Matrix: ");
		mt.dispMat(a);
		
		//Define a method to return how many odd & even no present in the matrix.
		int c[]=mt.countEO(a);
		System.out.println("Number of Even values: "+c[0]);
		System.out.println("Number of Odd values: "+c[1]);
		
		//Define a method to return how many positive & negative no present in the matrix.
		int pn[]=mt.countPN(a);
		System.out.println("Number of Positive values: "+pn[0]);
		System.out.println("Number of Negative values: "+pn[1]);
		
		//Define a method to return row wise biggest no present in the matrix.
		int b[]=mt.rowWiseBiggest(a);
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(i+1+" row Biggest is: "+b[i]);
		}
		
		//Define a method to return column wise biggest no present in the matrix.
		int cw[]=mt.columnWiseBiggest(a);
		for (int i = 0; i <cw.length; i++) 
		{
			System.out.println(i+1+" column Biggest is: "+cw[i]);
		}
		
		//Define a method to transpose the matrix.
		int t[][]=mt.transpose(a);
		mt.dispMat(t);
		
		System.out.println("--------------------------------");
		//Define a method to reverse the row wise element from  the matrix
		mt.reverseRowWise(a);
		
		System.out.println("--------------------------------");
		//Define a method to reverse the row wise element from  the matrix
		mt.reverseColumnWise(a);
		
		//Define a method to rotate the given matrix into 90 degree left and 90 degree right.
		/*
		 * [2 3 5]   ==>90degree right [9 6 2]  Transpose==>[2 6 9]
		 * [6 7 8] 					   [1 7 3]				[3 7 1]
		 * [9 1 4]					   [4 8 5]				[5 8 4]
		 */
		
		
		
		//Define a method to rotate the given matrix into 90 degree left and 90 degree right.
		/*
		 * [2 3 5]   ==>90degree left  [5 8 4]
		 * [6 7 8] 					   [3 7 1]
		 * [9 1 4]					   [2 6 9]
		 */
	}
}
