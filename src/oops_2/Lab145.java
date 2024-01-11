package src.oops_2;

import java.util.Scanner;

public class Lab145 {
	
	public static void main(String[] args) {
		
//		Person p = new Person(); // Default Constructor
//		new Person(); // default constructor
//		Person p; // nothing will be printed
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String name = sc.next();
		
		Person p1 = new Person(name);
		p1.printDetails();
		
		System.out.println("Enter second name: ");
		String name2 = sc.next();
		
		Person p2 = new Person(name2);
		p2.printDetails();
		sc.close();
	}

}
