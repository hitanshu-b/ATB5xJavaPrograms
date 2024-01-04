package src.oop_concepts;

import java.util.Scanner;

public class Lab123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2: ");
		int num2 = sc.nextInt();
		
		// does not work if the one of the integer is 0
		num1 = num1*num2;
		num2 = num1/num2;
		num1 = num1/num2;
		
		// using bitwise xor
		num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		sc.close();
	}

}
