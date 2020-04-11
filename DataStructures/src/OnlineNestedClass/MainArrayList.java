package OnlineNestedClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class MainArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList<String>();

		al.add("Rama");
		al.add("Shama");
		al.add("Bhima");
		System.out.println(al);

//		class MyComaparator implements Comparator<String>		//local inner class
//		{
//			int a=100;
//			@Override
//			public int compare(String o1, String o2) 
//			{
//				return -o1.compareTo(o2);
//				//return o2.compareTo(o1);
//			}
//		}
//
//		Comparator<String> c=new MyComaparator();
//		Collections.sort(al,c);
//		System.out.println(al);
		
		Comparator<String> c=(String o1, String o2)->{return -o1.compareTo(o2);};

		Collections.sort(al,(String o1, String o2)->{return -o1.compareTo(o2);});

		System.out.println(al);
	}
}
