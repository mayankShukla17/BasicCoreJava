public class Student {
	String name = "Guldu"; //Global variable
	void sleep() {
		double noh = 6.5; // Local variable
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.sleep();
		System.out.println(s);
	}
}
