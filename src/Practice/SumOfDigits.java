package src.Practice;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		long num = sc.nextLong();
		int sum = 0;
		sumDigits(num, sum);
		sc.close();
	}
	
	public static void sumDigits(long num, int sum) {
		for(sum=0; num!=0; num /=10) {
			sum = (int) (sum + num % 10);
		}
		System.out.println("Sum of Digits: "+sum);
	}
}
