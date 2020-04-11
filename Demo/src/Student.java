public class Student {
	String name;
	double perc;
	public Student() {
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(double p) {
		this.perc=p;
	}
	
	public Student(String name,double p) {
		this.name=name;
		this.perc=p;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student("MKS");
		Student s2 = new Student(85);
		Student s3 = new Student("MKS",85);
		
		System.out.println(s.name+" "+s.perc);
		System.out.println(s1.name);
		System.out.println(s2.perc);
		System.out.println(s3.name+" "+s3.perc);
		}
}
