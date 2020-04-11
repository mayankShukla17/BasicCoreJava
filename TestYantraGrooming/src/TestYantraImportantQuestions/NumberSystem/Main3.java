package TestYantraImportantQuestions.NumberSystem;

import java.util.Scanner;

//Determine whether the given integer is even or odd without using conditional statement
public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		String st[] = {"Even","Odd"};
//		System.out.println(n + " is " + st[n%2] + " Number ");
		System.out.println(n + " is " + st[n & 1] + " Number ");
	}
}
