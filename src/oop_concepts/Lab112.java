package src.oop_concepts;

import java.util.*;
//import java.util.Scanner;

public class Lab112 {
	
	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		System.out.println(c);
//		
//		a = 25;
//		b = 32;
//		int d = a+b;
//		System.out.println(d);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int input_1 = sc.nextInt();

		System.out.println("Enter 2nd number: ");
		int input_2 = sc.nextInt();
		int d = sum(input_1,input_2); // call to the function
		System.out.println("Sum: "+d);
		
		sayHello();
		sc.close();
	}
	
	static int sum(int input_1, int input_2) { // Function Definition
		return input_1 + input_2;
	}
	
	static void sayHello() {
		System.out.println("Hello");
	}

}
