public class Student {
	String name;
	
	String go_to_school() {
		return this.name + " " + "is going to school.";
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Guldu";
		System.out.println(s.go_to_school());
	}

}