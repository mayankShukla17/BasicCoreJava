package Singleton;

public class Book {
	private static Book b;
	String bname;
	double price;
	
	private Book(String bname , double price) {
		this.bname = bname;
		this.price = price;
	}
	
	void display() {
		System.out.println("Book Name " + bname);
		System.out.println("Book Price " + price);
	}
	
	static Book getBook(String name , double price){
		if (b == null)
			b = new Book(name , price);
		return b;
	}
}
