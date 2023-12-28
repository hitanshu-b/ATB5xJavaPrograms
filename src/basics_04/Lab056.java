package src.basics_04;

import java.util.Scanner;
public class Lab056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if, Switch --> condition based
		// Loops --> Which will repeat something --> for, while, do while
		// Switch condition
		// Which day is today
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day: ");
		int dayNum = sc.nextInt();
		
		switch(dayNum) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid");
			break; // this break is optional if default is last option
		}
		System.out.println("End");
		sc.close();		
	}
}
