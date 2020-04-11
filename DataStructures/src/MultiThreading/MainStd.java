package MultiThreading;
public class MainStd 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Student s1=new Student(123,"Rama",56.78);
		Student s2=s1; 	//Alias
		
		Student s3=new Student(s1.id,s1.name,s1.per); //Duplicate
		Student s4=new Student(s1); //Duplicate
		Student s5=(Student)s1.clone(); //Duplicate
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s5);
	}
}
