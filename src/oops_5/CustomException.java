package src.oops_5;

public class CustomException extends Exception {
	
	public CustomException(String msg) {
		super(msg);
		System.out.println("This is Custom Exception");
	}

}
