public class User {
	String userid;
	String password;
	
	@Override
	public String toString() {
		return this.userid +" "+ this.password ;
	}
	
	public static void main(String[] args) {
		
		User u = new User();
		u.userid = "123456";
		u.password = "asvashk";
		System.out.println(u);
		
		User u1 = new User();
		u1.userid = "654321";
		u1.password = "dhjhbsdbf";
		System.out.println(u1);
	}
	

}
