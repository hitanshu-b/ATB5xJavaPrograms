package src.oops_3.Interface;

public class RC {
	
	public static void main(String[] args) {
		
//		A a = new A(); // we cannot create object of Interface as they are incomplete
		B b = new B();
//		C c = new C(); // we can't create object of an Abstract class as they are incomplete
	}

}

interface A {
	
}

class B{
	
}

abstract class C{
	
}