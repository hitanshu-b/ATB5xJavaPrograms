package src.Practice;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		
//		Prime number checker. number 45 -> is Prime or Not
//		Factorial Example with yourself. (Github.com)
//		Leap Year Checker - 2000 -> Leap year ? true or false
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i < num; i++) {
            if (num % i == 0) {
            	isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();

	}
}
