import java.util.Scanner;

public class FibboniciSeries {
	static void printFib(int n){
		int f1=0,f2=1,f3;
		while (n>0){
			System.out.println(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the no ");
		int n=sc.nextInt();
		printFib(n);
	}
}
