package ArrayPrograms;
/*I/P:- a[]={"Amrit","Mayank","Akash"};
	O/P:-	A M A
			m a k
			r y a
			i a s
			t n h
			  k
 */
public class MountBlue
{
	public static void main(String[] args)
	{
		String a[]= {"Rajat","Mayank","Amrit"};
		for (int i = 0; i < a[1].length(); i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if(i<a[j].length())
				{
				char ch=a[j].charAt(i);
				System.out.print(ch+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
