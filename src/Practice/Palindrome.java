package src.Practice;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String original_string;
		System.out.println("Enter String or Number: ");
		original_string = sc.nextLine();
		
		int len = original_string.length();
		String reverse_string = "";
		
		for(int i=len-1; i>=0; i-- ) {
			reverse_string = reverse_string + original_string.charAt(i);
		}
		System.out.println("Reversed String: "+reverse_string);
		
		if(original_string.equals(reverse_string)) {
			System.out.println("Given String/Number is a Palindrome");
		}else {
			System.out.println("Given String/Number is not a Palindrome");
		}
		sc.close();
	}

}
