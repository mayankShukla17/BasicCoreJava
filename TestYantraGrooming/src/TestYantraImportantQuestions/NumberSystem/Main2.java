package TestYantraImportantQuestions.NumberSystem;
//WAP to print 98765432123456789 without using loop
public class Main2 {
	public static void main(String[] args) 
	{
		print(9);
	}

	public static void print(int n) 
	{
		System.out.print(n);
		if(n>1)
			print(n-1);
		if(n!=1)
		System.out.print(n);
	}
}
