public class SportsCentre {
	long contact;
	String address;
	String name = "SS";
	
	public static void main(String[] args) {
		SportsCentre s1 = new SportsCentre();
		s1.contact = 7986542472l;
		s1.address = "Jayanagra";
		System.out.println(s1.name + " " + s1.address + " " + s1.contact);
		
		SportsCentre s2 = new SportsCentre();
		s2.contact = 9980500900l;
		s2.address = "Kormangla";
		System.out.println(s2.name + " " + s2.address + " " + s2.contact);
	}
}
