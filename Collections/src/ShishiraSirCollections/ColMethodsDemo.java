package ShishiraSirCollections;
import java.util.ArrayList;
import java.util.Collection;

public class ColMethodsDemo {
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Guldu-Brothers");
		col.add(new Integer(25));
		col.add(10);
		col.add(false);
		col.add(new Boolean(false));
		Collection<String> col1=new ArrayList<String>();
		col1.add("Guldi");
		Collection<Integer> col2=new ArrayList<Integer>();
		col2.add(25);
		System.out.println(col);
		System.out.println(col1);
		System.out.println(col2);
 	}

}
