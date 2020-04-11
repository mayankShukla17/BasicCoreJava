import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius.");
		float r = sc.nextFloat();
		double pie = 22/7;
		double area = (pie*r*r);
		double circumference = (2*pie*r);
		System.out.println("Area of circle " + area);
		System.out.println("Circumference of circle " + circumference);
	}

}
