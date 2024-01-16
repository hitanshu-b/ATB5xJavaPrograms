package src.oops_3.polymorphism.methodOverriding;

public class RC {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.bark();
		
		Hound h = new Hound();
		h.bark();
		
		Dog f = new Hound(); // Dynamic Dispatch
		// Runtime polymorphism
		f.bark();
		
//		Hound a = new Dog(); // Not possible
//		// we can't have parents object
	}

}
