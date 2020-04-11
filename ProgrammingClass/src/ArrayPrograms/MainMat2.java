package ArrayPrograms;
public class MainMat2 
{
	public static void main(String[] args) 
	{
		int mat[][];	//Declaration
		mat=new int[3][4];	//Allocation
		
		mat[0][2]=56;
		mat[1][1]=67;	//Initialization
		mat[2][2]=54;
		
		for (int i = 0; i < mat.length; i++) 	//No of rows
		{
			for (int j = 0; j < mat[i].length; j++) 	//No of elements in ith row
			{
				System.out.print(mat[i][j]+" ");	//Accessing
			}
			System.out.println();
		}
	}
}
