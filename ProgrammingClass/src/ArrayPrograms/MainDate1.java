package ArrayPrograms;
import java.util.Scanner;
//WAJP to print no of days between two dates
public class MainDate1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First date:(dd mm yyyy)");		// 15 8 1947
		int d=sc.nextInt();							
		int m=sc.nextInt();
		int y=sc.nextInt();
		Date d1=new Date(d, m, y);
		System.out.println("Enter the Second date:(dd mm yyyy)");	// 7 2 2020
		d=sc.nextInt();							
		m=sc.nextInt();
		y=sc.nextInt();
		Date d2=new Date(d, m, y);
		
		System.out.println(d2.noOfDays()-d1.noOfDays());
		
		
		System.out.println("Day Name of First date: "+d1.getDayName());
		System.out.println("Day Name of Second date: "+d2.getDayName());
	}
}
