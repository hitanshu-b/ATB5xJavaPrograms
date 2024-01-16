package src.oops_3.polymorphism.methodOverloading;

public class Person {
	
	// Example of method overloading
	// it consist of methods with same name but different arguments
	
	void playFootball(String a) {
		System.out.println("A is a player: " +a);
	}
	
	void playFootball(int x) {
		System.out.println("X is number of goals: " +x);
	}
	
	int playFootball(float x1) {
		System.out.println("x1 is a float: "+x1);
		return 89;
	}

}
