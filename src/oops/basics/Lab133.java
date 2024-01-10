package src.oops.basics;

public class Lab133 {
	public static void main(String[] args) {
		
		// Immutable Strings
		String s1 = "James"; // scp
		String s2 = new String("James"); // Object area
		
		
		// Mutable Strings
		StringBuilder sb1 = new StringBuilder("James"); // Object area
		sb1.append(" Anderson");
		System.out.println(sb1);
		
		
		
		StringBuffer sbu1 = new StringBuffer("James"); // Object area
		sbu1.append(" Rodriguez");
		System.out.println(sbu1);
	}

}
