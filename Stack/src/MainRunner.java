
import java.util.Scanner;
import java.util.Stack;

public class MainRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.next();
		Stack<Character> stk = new Stack<Character>();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch=='(' || ch=='{' || ch=='[') {
				stk.push(ch);
			}
			else {
				if (stk.isEmpty()) {
					System.out.println("String is not balanced. ");
					return;
				}
				switch (ch) {
				case ')':if (stk.pop()!='(') {
					System.out.println("Not Balanced");
					return;
				}					
				break;
				case '}':if (stk.pop()!='{') {
					System.out.println("Not Balanced");
					return;
				}					
				break;
				case ']':if (stk.pop()!='[') {
					System.out.println("Not Balanced");
					return;
				}					
				break;
				}
			}
		}
		if (stk.isEmpty()) {
			System.out.println("String is balanced");
		}
		else {
			System.out.println("String is not balanced");
		}
			
	}
}
