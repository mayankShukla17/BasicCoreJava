public class Overload {
	int a=10;
	int c,b=20;
	void add(int a,int b) {
		c=a+b;
		System.out.println("2 Parameters "+c);
	}
	int add(int a,int b,int c) {
		int m;
		m=c+a-b;
		System.out.println("3 Parameters "+m);
		return m;
	}
}
