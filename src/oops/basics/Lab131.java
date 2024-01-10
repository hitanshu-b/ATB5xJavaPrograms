package src.oops.basics;

public class Lab131 {
	public static void main(String[] args) {
		
		String name = "Andrew";
		System.out.println(name.concat("Garfield"));
		System.out.println(name.contains("a"));
		System.out.println(name);
		
		
		String expected_result = "password@123";
		String actual_result = "Password@123";
		if(expected_result.equalsIgnoreCase(actual_result)) {
			System.out.println("Yes");
		}
	}

}
