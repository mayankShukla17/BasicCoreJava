package TestYantraImportantQuestions.NumberSystem;

import java.util.Scanner;

//WAP to determine maximum of 3 no without if else
public class Main4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three integers");
		int a,b,c,big;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		big = (a>b && a>c)?a:(b>c)?b:c;
		
		System.out.println("Biggest value is "  + big);

	}
}
