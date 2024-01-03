package src.oop_concepts;

import java.util.Scanner;

public class Lab114 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		leapYearCheck(year);
//		System.out.println("Enter 1st number: ");
//		double input_1 = sc.nextInt();
//
//		System.out.println("Enter 2nd number: ");
//		double input_2 = sc.nextInt();
//		double d = calculate(input_1,input_2); // call to the function
//		System.out.println("Power: "+d);
		sc.close();
	}
	
//	public static double calculate(double input_1, double input_2) {
//		return Math.pow(input_1, input_2);
//	}
	public static void leapYearCheck(int year) {
		if((year % 400 == 0)||(year % 100 != 0) && (year % 4 == 0)) {
			System.out.println("It is a leap year");
		}else {
			System.out.println("It is not a leap year");
		}
	}
}
