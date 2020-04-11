package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main1 {
	public static void main(String[] args) {
		FileInputStream fin =  null;
		try {
			fin= new FileInputStream("/home/mayank/ProgrammingClass/Example.java");
			int i;
			int count;
			while ((i=fin.read())!=-1) {
				System.out.println((char)i);
			}
			
//			while((i=fin.read())!=-1){
//				if(i=='\n')
//					count++;
//			}
//			System.out.println("No of lines: " + count);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fin.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
