package stack;

import java.util.Stack;

public class MainC2 
{
	public static void main(String[] args) 
	{
		Stack stk=new Stack();
		stk.push("Ramesh");
		stk.push("Suresh");
		stk.push("Mahesh");
		stk.push("Kamlesh");
		stk.push("Dinesh");
		stk.push("Girish");
		stk.push("Parmesh");
		stk.push("Nagesh");
		stk.push("Guldesh");
		stk.push("Rakesh");
		stk.push("Ropesh");
		System.out.println(stk.search("Rakesh"));
		System.out.println(stk.search("Raghu"));
		System.out.println(stk.search("Ramesh"));
		System.out.println(stk.pop());
		System.out.println(stk.search("Rakesh"));
		System.out.println(stk.search("Raghu"));
		System.out.println(stk.search("Ramesh"));
	}
}
