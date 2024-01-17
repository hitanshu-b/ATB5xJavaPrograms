package src.oops_3.Interface;

interface FatherI {
	
	void loan1k();
	
	default void print() {
		System.out.println("I am default method");
	}
	
	static void print2() {
		System.out.println("I am static method");
	}

}
