import java.util.Scanner;

public class FactorialNo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int no = sc.nextInt();
		int f = factorial(no);
		
		System.out.println("Factorial of " + no + " is " + f);
	}
	
	public static int factorial(int x){
			int fact = 1;
			while(x>1){
				fact=fact*x;
				x--;
			}
			return fact;
	}
}
