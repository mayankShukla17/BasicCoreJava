public class AccountDetail {
	long acctNumber;
	String name;
	double balance;
	
	AccountDetail(){
		this.acctNumber = 987654321L;
		this.name = "mks";
		this.balance = 100;
	}
	public static void main(String[] args) {
		AccountDetail ad = new AccountDetail();
		AccountDetail ad1 = new AccountDetail();
		
		System.out.println(ad.acctNumber +" "+ ad.name +" "+ ad.balance);
		System.out.println(ad1.acctNumber +" "+ ad1.name +" "+ ad1.balance);
		
		
	}

}
