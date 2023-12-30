package src.basics_06;

public class Lab098 {
	
	public static void main(String[] args) {
		
		// Arrays > In java
		// Collection of Data
		// Collection of similar Data types
		
		int a = 10;
		
		int [] marks = {96, 90, 89, 46, 78};
		//int [] marks_11 = {true, 54, 86, 87, 91}; invalid
		// int [] marks_12 = {123.23, 76, 88, 75, 67}; invalid
		
		String[] items = {"milk", "bread", "peanuts", "cashews", "almonds"};
		System.out.println(items[0]);
		System.out.println(items.length);
		System.out.println(items[3]);
		System.out.println(items[6]); // Exception is thrown
		
	}

}
