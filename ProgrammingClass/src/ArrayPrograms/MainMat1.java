package ArrayPrograms;
import java.util.Arrays;
//2D Array
public class MainMat1 
{
	public static void main(String[] args) 
	{
//		int a[]= {1,2,3};
//		System.out.println(Arrays.toString(a));
//		//System.out.println(Arrays.deepToString(a);
//		
//		int b[][]= {{2,3,4},{10,20,30,45},{11,22}};
//		System.out.println(Arrays.deepToString(b));
		
		int mat[][];
		int  [][]x;
		int[][] y;
		int []z[];
		
		int t[][]= {{2,3,4},{10,20,30,45},{11,22}};
		
		System.out.println(t);
		System.out.println(t[0]);
		System.out.println(t.length);
		System.out.println(t[1].length);
		
		System.out.println(t[0][1]);
		System.out.println(t[1][0]);
		System.out.println("----------------------------");
		for (int i = 0; i < t.length; i++) //no of rows
		{
			for (int j = 0; j < t[i].length; j++) //no of elements present in each row
			{
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
	}
}
