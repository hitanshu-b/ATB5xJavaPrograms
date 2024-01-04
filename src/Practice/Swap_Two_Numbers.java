package src.Practice;

import java.util.Scanner;

public class Swap_Two_Numbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2: ");
		int num2 = sc.nextInt();
		swapNumber(num1, num2);
		
//		//without using 3rd variable
//		a = a+b;
//		b = a-b;
//		a = a-b;

		//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
		sc.close();
	}
	public static void swapNumber(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Value of num1:  "+num1);
		System.out.println("Value of num2:  "+num2);
	}
}
