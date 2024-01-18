package src.oops_4;

public class StaticDemo {
	
	// Example of Static variable
	public static String college_name = "TheTestingAcademy";
	
	// Non Static variable >> Local variable or Instance Variable
	
	public int version = 3;
	
	// Static method
	public static void printName() {
		System.out.println("Name is: " +college_name);
		
		// We cannot have instance variable in the static method
		//System.out.println("Version is: "+version);
	}
	
	// Non-Static method
	public void printVersion() {
		System.out.println("Version is: "+version);
		System.out.println("Name is: " +college_name);
	}

}
