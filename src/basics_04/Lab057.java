package src.basics_04;

import java.util.Scanner;

public class Lab057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser name: ");
		String browser = sc.next();
		
		switch(browser.toLowerCase()) {
		case "chrome":
			System.out.println("Execute the chrome code");
			break;
		case "mozilla":
			System.out.println("Execute the mozilla code");
			break;
		case "edge":
			System.out.println("Execute the edge code");
			break;
		default:
			System.out.println("Invalid Browser");
		}
		sc.close();
	}
}
