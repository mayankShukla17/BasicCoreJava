package Strings;
public class Employee 
{
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	@Override
	public int hashCode() 
	{
		return id;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Employee e=(Employee)obj;
		return this.sal==e.sal;
	}
}
