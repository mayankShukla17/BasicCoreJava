public class Horse {
	String name = "Chetak";
	String color = "White";
	
	void run() {
		System.out.println(color + " " + name + " " + "Run");
	}
	
	void jump() {
		System.out.println(color  + " " + name + " " + "Jump");
	}
	
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
		h.jump();
	}
}
