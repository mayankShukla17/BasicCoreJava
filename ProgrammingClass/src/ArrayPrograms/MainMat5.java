package ArrayPrograms;
//Define a method to add two matrix
public class MainMat5 
{
	public static void main(String[] args) 
	{
		Matrix mt=new Matrix();
		System.out.println("First Matrix: ");
		int a[][]=mt.readMat();
		System.out.println("Second Matrix: ");
		int b[][]=mt.readMat();
		System.out.println("Entered First Matrix Elements ");
		mt.dispMat(a);
		System.out.println("Entered Second Matrix Elements ");
		mt.dispMat(b);
		
		int c[][]=mt.addMat(a, b);
		if(c==null)
			System.out.println("Addition is failed..");
		else
		{
			System.out.println("Added matrix: ");
			mt.dispMat(c);
		}
	}
}

/*
 * Define a method to return biggest element from the matrix  //DONE
 * Define a method to return sum of all the matrix elements
 * Define a method to return how many prime no present in the matrix 
 * Define a method to substract two matrix	
 * Define a method to return how many odd & even no present in the matrix //DONE
 */
