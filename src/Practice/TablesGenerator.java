package src.Practice;

import java.util.Scanner;

public class TablesGenerator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the range: ");
		int range = sc.nextInt();
		tableMultiplier(num, range);
		sc.close();
		
	}
	public static void tableMultiplier(int num, int range) {
		for(int i=1; i<=range; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
