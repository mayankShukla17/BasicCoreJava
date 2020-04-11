import java.util.Scanner;
//write a programming logic to generate to the series: 1,1,2,12,14,26,40,264,304,568...

/*first find the series.. which is a bit confusing.
The series comes like this " 1,1,2,12,14.. " where 1+1=2 =>i+j=2 where i and j are initialized as 1 and the result in a separate variable. in a similar way we need to consider to add the "j" values and the "ans" values so as to get the next number of the series. Once we get an answer which is a factor of 3, We need to multiply the result by 4.

1
1
(1+1)=2 ////
(1+2)=3 // (which is a modulus of 3)// hence multiply by 4. which is equal to= 3*4=12 which is the fourth number of the series. => ans = 12
Now, j=2, ans= 12.
(2+12)=14 // (j=12, ans= 14)// now add both for next number of the series
(12+14)= 26 // (6th number in series)
(14+26)= 40
(26+40)= 66 => which is a factor of 3, so multiply by 4 => 4*66 =264= ans
(40+264) => 304.. and goes on 
*/
class ArrayProg{
	public static void main(String[] ards){
		int a = 1;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the sequence:");
		int n = sc.nextInt();
		int c=1;
		for(int i = 0; i < n; i++){
			if(i < 2)
				System.out.println(a);
			else
			{
				c = a +b;
				if((i+1)%4 == 0)
					c *= 4;
				System.out.println(c);
				a = b;
				b = c;
			}

		}
	}
}