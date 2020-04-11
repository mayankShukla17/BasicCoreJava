public class Product {
	int pid;
	double price;
	int qty;


	@Override
	public String toString() {
		return this.pid + " " + this.price + " " + this.qty ;
	}
	
	public static void main(String[] args) {
		Product p = new Product();
		p.pid = 1;
		p.price = 10.00;
		p.qty = 5;
		System.out.println(p);
		
		Product p1 = new Product();
		p1.pid = 2;
		p1.price = 20.00;
		p1.qty = 10;
		System.out.println(p1);
	}

}
