package src.Practice;

import java.util.Scanner;

public class TempratureConverter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temprature in Celcius: ");
		double cel = sc.nextDouble();
		
		System.out.println("Enter Temprature in Fahrenheit: ");
		double farh = sc.nextDouble();
		
		celciusToFahrenheit(cel,farh);
		fahrenheitToCelcius(farh, cel);
		sc.close();
	}
	
	public static void celciusToFahrenheit(double cel, double farh) {
		cel = (farh - 32) * 5/9;
		System.out.println("Temprature is Celcius: "+cel);
	}
	
	public static void fahrenheitToCelcius(double farh, double cel) {
		farh = (cel * 9/5) + 32;
		System.out.println("Temprature in Fahrenheit: "+farh);
		
	}

}
