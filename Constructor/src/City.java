class City {
	int pinCode;
	String name;
//	custom constructor
	City() {
		this.pinCode = 560076;
		this.name = "BTM BLR";
	}
	
	public static void main(String[] args) {
		City c1 = new City();
		City c2 = new City();
		
		System.out.println(c1.pinCode + " " + c1.name);
		
		System.out.println(c1.pinCode + " " + c2.name);
		
	}

}
