package src.oops_4.InnerClass;

public class Lab160 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		p = c;
		// c = p;
		
		
		Hello h = new Child2();
		Child2 h2 = (Child2)h; //Downcasting in classes
		
	}

}
// Upcasting and Downcasting in class

class Hello{}
class Child2 extends Hello{}

class Parent{}

class Child extends Parent{}
