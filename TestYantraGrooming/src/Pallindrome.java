import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int no = sc.nextInt();
		
		boolean rs = isPalindrome(no); 
		if(rs==true)
			System.out.println( no + " Is Palindrome ");
		else
			System.out.println( no + " Is Not Palindrome");
		
	}
	public static boolean isPalindrome(int x){
		int rev= 0,t=x;
		while(x!=0){
			int r = x%10;
			rev=rev*10+r;
			x=x/10;
			}
			return rev==t;			
	}
}
