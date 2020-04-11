package OnlineNestedClass;

import java.util.Comparator;
import java.util.TreeSet;

public class MainRunner 
{
	public static void main(String[] args) 
	{
		Comparator<Integer> com=new Comparator<Integer>() 
		{
			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1-o2);
			}
		};
		
		TreeSet ts=new TreeSet<Integer>();
		ts.add(34);
		ts.add(56);
		ts.add(89);
		ts.add(54);
		ts.add(29);
		ts.add(86);
		System.out.println(ts);
	}
}
