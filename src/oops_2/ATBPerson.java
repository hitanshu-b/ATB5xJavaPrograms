package src.oops_2;

public class ATBPerson {
	
	// this are basically called as Instance Variables
	// they can be accessed only through the object reference
	// instance variable values are default values
	
	String name;
	long phoneno;
	String email_id;
	
	void talk() {
		System.out.println("Talk");
	}
	
	void printDetails() {
		System.out.println(name);
		System.out.println(phoneno);
		System.out.println(email_id);
	}

}
