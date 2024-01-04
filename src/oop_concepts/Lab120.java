package src.oop_concepts;

public class Lab120 {
	
	public static void main(String[] args) {
		int b = 10;
		int d = --b + b++ + b--;
		System.out.println(d);
		// A > Exp > 9, b > 9
		// B > Exp > 9, b > 10
		// C > Exp > 9, b > 9
	}

}
