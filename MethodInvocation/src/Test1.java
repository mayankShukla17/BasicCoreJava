public class Test1 {
	{
		int i = 20; // Local variable
		System.out.println(i);
	}
	public Test1() {
		String s = "Jspiders"; // Local variable
		System.out.println(s);
	}
	void meth() {
		double d = 515.25; // Local variable
		System.out.println(d);
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.meth();
	}
}
