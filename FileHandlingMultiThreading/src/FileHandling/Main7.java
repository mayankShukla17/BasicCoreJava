package FileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Iterator;

public class Main7 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin= new FileInputStream("/home/mayank/ProgrammingClass/students.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Object obj=oin.readObject();
		
		HashSet hs= (HashSet)obj;
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		oin.close();
		fin.close();
	}

}
