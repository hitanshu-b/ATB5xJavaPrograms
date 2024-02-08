package src.collections;

import java.util.Set;
import java.util.HashSet;

public class Lab191 {
	
	public static void main(String[] args) {
		Set<String> fruits = new HashSet();
		fruits.add("Apple");
		fruits.add("Oranges");
		fruits.add("Oranges");
		fruits.add("Strawberry");
		System.out.println(fruits);
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.size());
		
		
	}

}
