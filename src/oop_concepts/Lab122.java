package src.oop_concepts;

import java.util.Scanner;

public class Lab122 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2: ");
		int num2 = sc.nextInt();
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		sc.close();
	}
}
