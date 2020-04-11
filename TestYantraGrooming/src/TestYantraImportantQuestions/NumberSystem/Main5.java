package TestYantraImportantQuestions.NumberSystem;

import java.util.Scanner;

//WAP to determine given integer is palindrome or not
public class Main5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		boolean rs=isPalindrome(n,0,n);
		if(rs)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	static boolean isPalindrome(int n, int rev, int t) {
		if(n==0)
			return rev==t;
		rev=rev*10+n%10;
		return isPalindrome(n/10, rev, t);
	}
}
