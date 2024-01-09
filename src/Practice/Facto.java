package src.Practice;

import java.util.Scanner;

public class Facto {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		factorialCheck(num);
		sc.close();
	}
	
	public static void factorialCheck(int num) {
		int res = 1;
		for(int i=2; i<=num; i++) {
			res *= i;
		}
		System.out.println("Factorial of " + num + " is: "+res);
	}
}
