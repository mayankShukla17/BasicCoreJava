package FileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main5 {
	public static void main(String[] args) throws Exception  {
		FileInputStream fin= new FileInputStream("/home/mayank/ProgrammingClass/myObject.txt");
		
		ObjectInputStream oin=new ObjectInputStream(fin);
		
		Student st=(Student)oin.readObject();
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.per);
	}
}
