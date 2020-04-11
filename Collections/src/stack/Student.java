package stack;
public class Student implements Comparable 
{
	int id;
	String name;
	double per;
	public Student(int id,String name,double per) 
	{
		super();
		this.id=id;
		this.name=name;
		this.per=per;
	}
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", per=" + per + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Object o) 
	{
		Student st=(Student)o;
		return this.id-st.id;
	}
}
