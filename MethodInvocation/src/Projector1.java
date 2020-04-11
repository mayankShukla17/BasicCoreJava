public class Projector1 {
	String model = "Epson"; //Instance Variable
	String color = "White";
	
	void display() {
		System.out.println(this.color + " " + this.model + " Projector Display");
		System.out.println(this.color + " " + this.model);
	}
	
	public static void main(String[] args) {
		Projector1 p = new Projector1();
		p.display();
	}
}
