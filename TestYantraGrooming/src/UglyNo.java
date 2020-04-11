import java.util.Scanner;

public class UglyNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int n=sc.nextInt();
		boolean un=isUglyNo(n);
		if(un)
			System.out.println(n+" Is Ugly Number ");
		else
			System.out.println(n+" Is Not An Ugly Number ");
	}

	public static boolean isUglyNo(int n) {
		n=divisbleBy(n,2);
		n=divisbleBy(n,3);
		n=divisbleBy(n,5);
		return (n == 1)? true : false;
	}

	public static int divisbleBy(int n, int i) {
		while(n%i==0)
			n=n/i;
		return n;
	}
}
