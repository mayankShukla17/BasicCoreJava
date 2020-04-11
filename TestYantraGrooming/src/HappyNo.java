import java.util.Scanner;

public class HappyNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		boolean hn=happyNo(n);
		if(hn)
			System.out.println(n+" is Happy No");
		else
			System.out.println(n +" is not a Happy No");
	}

	public static boolean happyNo(int n) {
		while(n>9){
			int sum=0;
			do{
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}while(n!=0);
			n=sum;
		}
		return n==1 || n == 7;
	}
}
