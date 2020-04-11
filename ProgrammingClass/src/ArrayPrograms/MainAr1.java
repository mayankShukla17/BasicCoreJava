package ArrayPrograms;
import java.util.Scanner;
//WAJP to print the user enetered no in the form of sentence.
public class MainAr1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt(); 	//237845345
		nw(n/10000000," Crore ");
		nw(n/100000%100," Lakh ");
		nw(n/1000%100," Thousand ");
		nw(n/100%10," Hundred ");
		nw(n%100,"");
	}
	public static void nw(int x,String st) 
	{
		String one[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve",
				"thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String two[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		if(x<20)
			System.out.print(one[x]);
		else
			System.out.print(two[x/10]+one[x%10]);

		if(x!=0)
			System.out.print(st+" ");
	}
}
