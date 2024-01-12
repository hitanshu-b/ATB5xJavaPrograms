package src.oops_2.Inheritance;

public class Programming {
	
	int version;
	String author;
	
	// Default constructor
	Programming(){
		System.out.println("DC");
	}
	
	// Param Constructor
	Programming(int version_info, String authorName){
		this.version = version_info;
		this.author = authorName;
	}
	
	void printInfo() {
		System.out.println("Program Version: "+ version + "Author Name: " +author);
	}

}
