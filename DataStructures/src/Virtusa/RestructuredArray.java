package Virtusa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RestructuredArray 
{
	public static List<Integer> getElements(List<Integer> arr,List<List<Integer>> queries)
	{
		int mat[][]=new int[arr.size()/arr.get(0)][arr.get(0)];
		//ArrayList<ArrayList<Integer> > mat  = new ArrayList<ArrayList<Integer> >(); 
		int k=1;
		for (int i = 0; i < mat.size(); i++) 
		{
			for (int j = 0; j < mat.get(i).size(); j++) 
			{
				mat[i][j]=arr.get(k++);
			}
		}
		List<Integer> rs=new ArrayList<Integer>();
		for (List<Integer> q :queries) 
		{
			rs.add(mat[q.get(0)-1][q.get(1)-1]);
		}
		return rs;
	}
	public static void main(String[] args) 
	{
		List arr=Arrays.asList(5,1,2,3,4,5,6,7,8,9,10);
		System.out.println(arr);
		
		List<List<Integer>> q=new ArrayList<List<Integer>>();
		q.add(Arrays.asList(1,1));
		q.add(Arrays.asList(1,2));
		q.add(Arrays.asList(2,1));
		q.add(Arrays.asList(2,2));
		System.out.println(getElements(arr, q));
	}
}
