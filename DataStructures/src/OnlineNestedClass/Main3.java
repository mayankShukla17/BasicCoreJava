package OnlineNestedClass;

import java.util.Comparator;
import java.util.TreeSet;

public class Main3 
{
	public static void main(String[] args) 
	{
		Arithmetic a1=(x,y)->x+y;
		Arithmetic a2=(a,b)->a+b;
		System.out.println(a1.perform(10,20));//30
		System.out.println(a2.perform(20,20));
		
		Arithmetic a3=(x,y)->x*y;
		System.out.println(a3.perform(10,20));
		
		Arithmetic a4=(x,y)->{if(x>y)return x;else return y;};
		System.out.println(a4.perform(5,20));
		
		Arithmetic a5=(x,y)->x>y?x:y;
		System.out.println(a5.perform(5,20));
		
		Comparator<Integer> com=(obj1,obj2)->obj1.hashCode()-obj2.hashCode();
		System.out.println(com);
		
		class MyCompare implements Comparator<Integer>
		{
			@Override
			public int compare(Integer o1, Integer o2) 
			{
				return o1.hashCode()-o2.hashCode();
			}
		}
		TreeSet ts=new TreeSet<>((obj1,obj2)->obj1.hashCode()-obj2.hashCode());
		//TreeSet ts=new TreeSet<>(com);
		System.out.println(ts);
	}
}
