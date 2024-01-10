package src.oops;

import java.util.Scanner;

public class Lab137 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String user_input = sc.next();
		boolean result = isPalindrome(user_input);
		if(result) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}
	
	private static boolean isPalindrome(String user_input) {
		String original_str = user_input;
		StringBuilder sb = new StringBuilder(user_input);
		sb.reverse();
		return original_str.equalsIgnoreCase(sb.toString());
	}
}
