import java.util.*;
public class Amrit 
{
	public static boolean TriSeq(List<Integer> num)
	{
		if(num<0)
			return false;
		int sum=0;
		for (int i = 1;sum<=num; i++) 
		{
			sum=sum+i;
			if(sum==num)
				return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(22);
		al.add(28);
		al.add(36);
		al.add(45);
		al.add(55);

	}
}
