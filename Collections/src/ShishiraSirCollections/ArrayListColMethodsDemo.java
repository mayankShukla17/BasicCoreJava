package ShishiraSirCollections;
import java.util.ArrayList;
import java.util.Collection;
public class ArrayListColMethodsDemo {
	public static void main(String[] args) {
		Collection<String> csCol=new ArrayList<String>();
		csCol.add("Guldi");
		csCol.add("Nidhi");
		csCol.add("Mahesh");
		csCol.add("Rahul");
		csCol.add("Mansi");
		
		Collection<String> ecCol=new ArrayList<String>();
		ecCol.add("Akshatha");
		ecCol.add("Sohail");
		ecCol.add("Swathi");
		ecCol.add("Shushmita");
		
		Collection<String> mechCol=new ArrayList<String>();
		mechCol.add("Aliya");
		mechCol.add("Katrina");
		mechCol.add("Shishira");
		mechCol.add("Deepika");
		
		Collection<String> googleCol=new ArrayList<String>();
		googleCol.addAll(csCol);
		googleCol.addAll(ecCol);
		googleCol.addAll(mechCol);
		System.out.println(googleCol);
		System.out.println("Total data "+googleCol.size());
		googleCol.remove("Mahesh");
		System.out.println(googleCol);
		System.out.println(googleCol.contains("Mahesh"));
		System.out.println(googleCol.containsAll(mechCol));
		googleCol.removeAll(csCol);
		System.out.println(googleCol);
		googleCol.removeAll(ecCol);
		System.out.println(googleCol);
		googleCol.retainAll(mechCol);
		System.out.println(googleCol);
		Object obj[]=googleCol.toArray();
		System.out.println(googleCol);
		googleCol.clear();
		System.out.println(googleCol);
	}
}
