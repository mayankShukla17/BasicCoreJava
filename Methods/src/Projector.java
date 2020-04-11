public class Projector {
	String color = "White";
	String brand = "EPSON";
	void display() {
		System.out.println(color + " " + brand);
	}
	
	public static void main(String[] args) {
		Projector p = new Projector();
		p.display(); // Method Call/Invocation
		
	}
	
	
}
