public class Vehicle {
	String c = "BMW";
	
	void start() {
		System.out.println("Start");
	}
}

class Car extends Vehicle{
//	String f=super.c;
	@Override
	void start() {
		System.out.println("Push the button and start");
		Vehicle v = new Car();
		System.out.println(v.c);
	
	}
}

