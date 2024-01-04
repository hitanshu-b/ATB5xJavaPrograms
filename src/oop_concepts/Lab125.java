package src.oop_concepts;

import java.util.Scanner;

public class Lab125 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int n = sc.nextInt();
		int [] array_int = new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			array_int[i] = sc.nextInt();
		}
		System.out.println("Array Elements: ");
		
		for(int i=0; i<n; i++) {
			System.out.println(array_int[i]);
		}
		sc.close();
	}
}
