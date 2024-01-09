package src.Practice;

import java.util.Scanner;

public class VowCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String word = sc.next();
		word = word.toLowerCase();
		int vowCount = 0;
		int conCount = 0;
		alphabetCal(word, vowCount, conCount);
		sc.close();
	}
	public static void alphabetCal(String word, int vowCount, int conCount) {
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u') {
				vowCount++;	
			}
			else {
				conCount++;
			}
		}
		System.out.println("Number of vowels: "+vowCount);
		System.out.println("Number of Consonants: "+conCount);
	}
}
