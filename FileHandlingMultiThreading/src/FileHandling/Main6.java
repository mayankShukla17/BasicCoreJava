package FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;


public class Main6 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		HashSet<Student> stds= new HashSet<Student>();
		while(true) {
			System.out.println("Enter name id and per");
			String name= sc.next();
			int id = sc.nextInt();
			double per=sc.nextDouble();
			Student std=new Student(id, name, per);
			stds.add(std);
			System.out.println("Do you have more student");
			String st=sc.next();
			if(st.equalsIgnoreCase("no"))
				break;
		}
		
		FileOutputStream fout=new FileOutputStream("/home/mayank/ProgrammingClass/students.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(stds);
		System.out.println("Successfully writen...");
		out.flush();
		fout.flush();
		out.close();
		fout.close();
	}

}
