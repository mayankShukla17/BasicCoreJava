package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		String str="Java is a very easy programming language";
		FileOutputStream fout=null;
		try {
			fout= new FileOutputStream("/home/mayank/ProgrammingClass/sample.txt");
			byte b[]=str.getBytes();
			fout.write(b);
			fout.flush();
			System.out.println("Successfully writen...");
		}
		catch (FileNotFoundException e) {

		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fout.close();
			} 
			catch (IOException e) {
				System.out.println(e);
			}
			
		}
	}

}
