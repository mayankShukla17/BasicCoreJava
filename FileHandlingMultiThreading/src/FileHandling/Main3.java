package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		FileInputStream fin =  null;
		FileOutputStream fout=null;
		try {
			fin= new FileInputStream("/home/mayank/ProgrammingClass/Example.java");
			fout= new FileOutputStream("/home/mayank/ProgrammingClass/MyExample.java");
			int i;

			while ((i=fin.read())!=-1) {
				System.out.println((char)i);
				Thread.sleep(100);
				fout.write(i);
			}
			fout.flush();
			System.out.println("Successfully copied...");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		finally {
			try {
				fin.close();
				fout.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
