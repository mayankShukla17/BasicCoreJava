package FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main4 {
	public static void main(String[] args) throws Exception {
		Student std= new Student(123,"MKS",74.56);
		
		FileOutputStream fout=new FileOutputStream("/home/mayank/ProgrammingClass/myObject.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(std);
		
		System.out.println("Successfully writen");
		out.flush();
		fout.flush();
		fout.close();
		out.close();

	}

}
