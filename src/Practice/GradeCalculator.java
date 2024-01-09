package src.Practice;

import java.util.Scanner;

public class GradeCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int score = sc.nextInt();
		gradeCalculator(score);
		sc.close();
	}
	public static void gradeCalculator(int score) {
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}
		else if(score >= 80 && score <= 89) {
			System.out.println("B");
		}
		else if(score >= 70 && score <= 79) {
			System.out.println("C");
		}
		else if(score >= 60 && score <= 69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
 