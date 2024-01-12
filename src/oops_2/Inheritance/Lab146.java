package src.oops_2.Inheritance;

public class Lab146 {
	public static void main(String[] args) {
		
		Programming p = new Programming();
		//How JVM understands the above line
		
		// Programming >> Class == Class Loader
		// p >> ref to the object
		// new Programming >> Object
		// DC is called
		
		p.printInfo();
		
		Programming p2 = new Programming(12, "Perl");
		//How JVM understands the above line
		
		//Programming >> Class == Class Loader
		// p2 >> ref to the object
		// new Programming >> object
		// Param constructor is called
		
		p2.printInfo();
	}

}
