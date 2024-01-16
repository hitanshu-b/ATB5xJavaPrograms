package src.oops_3;

public class BlockClass {
	
	{ // Instance Initialization block
		System.out.println("This is IIB");
	}
	
	BlockClass(){
		System.out.println("Default Constructor");
	}
	
	static { // Static Initialization Block
		System.out.println("This is SIB");
	}

}
