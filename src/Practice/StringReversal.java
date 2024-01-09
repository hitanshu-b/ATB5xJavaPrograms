package src.Practice;

import java.util.Scanner;

public class StringReversal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String original = sc.next();
		String reversed = "";
		reverseString(original, reversed);
		
		sc.close();
	}
	public static void reverseString(String original, String reversed) {
		for(int i=original.length()-1; i>=0; i--) {
			reversed += original.charAt(i);
		}
		System.out.println("Reversed String: "+reversed);
	}

}
