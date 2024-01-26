package src.oops_6;

import java.util.Stack;

public class Lab189 {

	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.push("A");
		s.push("b");
		s.push("c");
		s.push("D");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
	}
}
