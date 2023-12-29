package src.basics_05;

import java.util.Scanner;

public class Lab068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		double x = sc.nextDouble();
		System.out.println("Enter the value of y: ");
		double y = sc.nextDouble();
		System.out.println("Enter the value of z: ");
		double z = sc.nextDouble();
		double result;
		
		result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
		System.out.println(result);
		sc.close();
		
		//Scanner stream should be closed after we are done
		// You have to tell JVM which input user is enter
		// sc.next() --> String
		// sc.nextDouble() --> Double
		// sc.nextInt() --> Int
		// sc.nextFloat() --> Float
	}
}
