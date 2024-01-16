package src.oops_3.polymorphism.methodOverloading;

public class RC {
	
	public static void main(String[] args) {
		
		new Person().playFootball(10);
		new Person().playFootball("ramesh");
		new Person().playFootball(3);
		new Person().playFootball(3.14f);
		
		// at compile time, JVM will decide which one i have to call
	}

}

