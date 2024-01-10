package src.oops.basics;

public class Lab132 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = new String("hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s3));
	}
}
