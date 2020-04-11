import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		int l=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle");
		int b=sc.nextInt();
		int a=areaOfRectangle(l,b);
		System.out.println("Area of Rectangle "+a);
	}

	public static int areaOfRectangle(int l, int b) {
		int a=l*b;
		return a;
//		return l*b;
	}
}
