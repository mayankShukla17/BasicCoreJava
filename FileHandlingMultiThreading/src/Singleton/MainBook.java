package Singleton;

public class MainBook {
	public static void main(String[] args) {
		Book b1 = Book.getBook("JAVA", 355.56);
		b1.display();
		Book b2 = Book.getBook("C++", 155.50);
		b2.display();
		Book b3 = Book.getBook("C#", 450.00);
		b3.display();
	}

}
