package src.multithreading.generics;

import java.util.Scanner;

public class MaxOfThreeNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maximum = maxNum(a,b,c);
		System.out.println(maximum);
		sc.close();
	}
	
	public static int maxNum(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}

}
