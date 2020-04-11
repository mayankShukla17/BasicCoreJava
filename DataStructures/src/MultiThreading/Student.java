package MultiThreading;
public class Student implements Cloneable
{
	int id;
	String name;
	double per;
	public Student(int id, String name, double per) 
	{
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	public Student(Student std) 
	{
		this.id = std.id;
		this.name = std.name;
		this.per = std.per;
	}
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
}
