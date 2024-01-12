package src.oops_2;

public class Dog {
	
	String name;
	
	Dog(){
		System.out.println("DC");
	}
	
	Dog(String nameRef){
		this.name = nameRef;
		System.out.println("PC");
	}
	
	void printDetails() {
		int age = 10; //local variable
		System.out.println("Print Details");
		System.out.println("Dog name is: "+ name);
	}

}
