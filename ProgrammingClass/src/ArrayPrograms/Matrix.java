package ArrayPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class Matrix 
{
	int[][] readMat()
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
		return mat;
	}

	public void dispMat(int mat[][])
	{
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	public int[][] addMat(int x[][],int y[][])
	{
		if(x.length!=y.length || x[0].length!=y[0].length)
		{
			System.out.println("Not possible to add");
			return null;
		}
		int z[][]=new int[x.length][x[0].length];
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j <x[i].length; j++) 
			{
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}

	public int[][] substractMat(int x[][],int y[][])
	{
		if(x.length!=y.length || x[0].length!=y[0].length)
		{
			System.out.println("Not possible to add");
			return null;
		}
		int z[][]=new int[x.length][x[0].length];
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j <x[i].length; j++) 
			{
				z[i][j]=x[i][j]-y[i][j];
			}
		}
		return z;
	}

	public int[] countEO(int[][] mat) 
	{
		int count[]= {0,0};
		for (int i = 0; i <mat.length; i++) 
		{
			for (int j = 0; j <mat[i].length; j++) 
			{
				count[mat[i][j]%2]++;
			}
		}
		return count;
	}

	public int[] countPN(int mat[][])
	{
		int count[]= {0,0};
		for (int i = 0; i <mat.length; i++) 
		{
			for (int j = 0; j <mat[i].length; j++) 
			{
				if(mat[i][j]>=0)
					count[0]++;
				else
					count[1]++;
			}
		}
		return count;
	}

	public int[] rowWiseBiggest(int mat[][])
	{
		int big[]=new int[mat.length];
		for (int i = 0; i <mat.length; i++) 
		{
			big[i]=mat[i][0];
			for (int j =1; j <mat[i].length; j++) 
			{
				if(big[i]<mat[i][j])
					big[i]=mat[i][j];
			}
		}
		return big;
	}

	public int[] columnWiseBiggest(int mat[][])
	{
		int big[]=new int[mat[0].length];
		for (int i = 0; i <mat[0].length; i++) 
		{
			big[i]=mat[0][i];
			for (int j = 0; j <mat.length; j++) 
			{
				if(big[i]<mat[j][i])
					big[i]=mat[j][i];
			}
		}
		return big;
	}

	public int[][] transpose(int mat[][])
	{
		int t[][]=new int[mat[0].length][mat.length];
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				t[j][i]=mat[i][j];
			}
		}
		return t;
	}

	public void reverseRowWise(int mat[][])
	{
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length/2; j++) 
			{
				int t=mat[i][j];
				mat[i][j]=mat[i][mat[i].length-1-j];
				mat[i][mat[i].length-1-j]=t;
			}
		}
		dispMat(mat);
	}

	public void reverseColumnWise(int[][] mat) 
	{
		for (int i = 0; i < mat.length/2; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				int t=mat[i][j];
				mat[i][j]=mat[mat.length-1-i][j];
				mat[mat.length-1-i][j]=t;
			}
		}
		dispMat(mat);
	}
}
