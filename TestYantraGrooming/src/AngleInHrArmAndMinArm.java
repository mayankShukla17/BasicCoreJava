import java.util.Scanner;

public class AngleInHrArmAndMinArm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time (hh,mm)");
		int hr=sc.nextInt();
		int min=sc.nextInt();
		double mangle=min*6;
		double hangle=hr*30+min*0.5;
		double angle=0.0;
		if(mangle>hangle)
			angle=mangle-hangle;
		else
			angle=hangle-mangle;
		if(angle>180)
			angle=360-angle;
		System.out.println("Angle is "+angle);
	}
}
