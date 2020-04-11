public class Test extends Override1{
	@Override
	void onClick() {
		System.out.println("Child class method");
		super.onClick();
	}
	public static void main(String[] args) {
		Override1 o=new Test();
		o.onClick();
	}
}
