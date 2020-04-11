import java.util.Scanner;

public class StrongNo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		boolean rs=isStrong(n);
		if(rs)
			System.out.println(n+" is Strong  No ");
		else
			System.out.println(n+" is not a Strong No ");
	}

	static boolean isStrong(int n){
		int sum=0,t=n;
		do{
			int r = n%10;
			sum=sum+fact(r);
			n=n/10;
		}while(n!=0);
		return sum==t;
	}

	static int fact(int x){
		int f=1;
		while(x>1){
			f=f*x;
			x--;
		}
		return f;
	}
}
