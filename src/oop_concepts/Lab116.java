package src.oop_concepts;

import java.util.Scanner;

public class Lab116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		System.out.println(sc.next());
		sc.close();
	}
	
	// we can create another main function but the argument should be different
	
	public static void main(int a) {
		System.out.println("Another main");
	}
	
	// we can also create it with the return type
	// this is the example of method overloading
	
	public static int main(int c, int d) {
		return c + d;
	}
}
