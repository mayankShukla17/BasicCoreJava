package ArrayPrograms;
import java.util.Scanner;
public class MainMat3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int mat[][];
		System.out.println("Enter the order of matrix: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		mat=new int[row][col];	//Allocate
		System.out.println("Enter "+row*col+" elements: ");
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered Matrix: ");
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
