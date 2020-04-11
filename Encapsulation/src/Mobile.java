
public class Mobile {
	private long mobNumber; //write only
	private final String MAN_COUNTRY = "INDIA";//read-only
	
	
	public long getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}
	public String getMAN_COUNTRY() {
		return MAN_COUNTRY;
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setMobNumber(8090546476L);
		System.out.println(m.getMobNumber() + " " + m.MAN_COUNTRY);
	}

}
