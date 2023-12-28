package src.basics_04;

import java.util.Scanner;
import java.lang.Math;

public class Lab066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
