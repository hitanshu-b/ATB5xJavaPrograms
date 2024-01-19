package src.oops_4.Exceptions;

public class Lab164 {
	
	public static void main(String[] args) {
		try {
			String name = null;
			name.trim();
			System.out.println("THis is me!!!!");
		} catch (Exception e){
			System.out.println("This is not possible");
		}
		
	}

}
