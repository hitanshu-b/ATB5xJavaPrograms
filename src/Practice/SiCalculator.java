package src.Practice;

import java.util.Scanner;

public class SiCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principle Amount: ");
		double p = sc.nextDouble();
		
		System.out.println("Enter Rate: ");
		float r = sc.nextFloat();
		
		System.out.println("Enter Time: ");
		int t = sc.nextInt();
		calculator(p, r, t);
		sc.close();
	}
	public static void calculator(double p, float r, int t) {
		double si = (p*r*t) / 100;
		System.out.println("Simple Interest: "+si);
	}

}
