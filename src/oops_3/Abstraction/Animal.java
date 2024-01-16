package src.oops_3.Abstraction;

public abstract class Animal {
	
	Animal(){}
	
	void m1() { // concrete method - means complete method
		System.out.println("inside m1()");
	}

	abstract void m2(); // incomplete method
}
