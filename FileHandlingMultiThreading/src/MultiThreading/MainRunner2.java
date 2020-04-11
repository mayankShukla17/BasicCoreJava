package FileHandling;

public class MainRunner2 {
	public static void main(String[] args) {
		CapitalThread ct = new CapitalThread();
		ct.start();
		SmallThread st = new SmallThread();
		st.start();
	}
}
