public class Test {
	{
		int i = 20; // Local variable
		System.out.println(i);
	}
	public Test() {
		String s = "Jspiders"; // Local variable
		System.out.println(s);
	}
	void meth() {
		double d = 515.25; // Local variable
		System.out.println(d);
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.meth();
	}
}
