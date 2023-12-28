package src.basics_04;

import java.util.Scanner;

public class Lab050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(true) {
//			System.out.println("True");
//		}
//		else {
//			System.out.println("Flase");
//		}
//		
//		if(true) {
//			System.out.println("Only if");
//		}
		
		// if we have multiple condition then we can use if.. else if.. else
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number > 20) {
			System.out.println("Number is greater than 20");
		}else if(number > 10) {
			System.out.println("Number is greater than 10");
		}else {
			System.out.println("Number is less");
		}
	}
}
