public class AdharCard {
	long adharNumber;
	String name;
	
	public AdharCard(long adharNumber, String name) {
		// TODO Auto-generated constructor stub
		this.adharNumber = adharNumber;
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		AdharCard ac = new AdharCard(649296752855L ,"mks");
		System.out.println(ac.adharNumber +" "+ ac.name);
		
		AdharCard ac1 = new AdharCard(324575889123L, "kls");
		System.out.println(ac1.adharNumber +" "+ ac1.name);
	}

}
