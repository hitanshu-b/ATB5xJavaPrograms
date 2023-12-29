package src.basics_05;

import java.util.Scanner;

public class Lab069 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = user_input.next();
		
		System.out.println("Enter Your Age: ");
		int age = user_input.nextInt();
		
		System.out.println("Enter your Salary: ");
		double salary = user_input.nextDouble();
		
		System.out.println("Your Details are: " +name + age + salary);
		
		user_input.close();
	}
}
