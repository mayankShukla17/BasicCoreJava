package Strings;
public class MainRunner 
{
	public static void main(String[] args) 
	{
		Student st=new Student(123,"Ramesh",78.83);
		Employee e1=new Employee(124,"Rajesh",57474);
		display(st);
	}

	static void display(Object obj) 
	{
		if (obj instanceof Employee) 
		{
			Employee e=(Employee)obj;
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.sal);
		}
		else if (obj instanceof Student) 
		{
			Student st=(Student)obj;
			System.out.println(st.id);
			System.out.println(st.name);
			System.out.println(st.per);
		}
	}	
}
