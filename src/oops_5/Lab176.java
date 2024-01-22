package src.oops_5;

public class Lab176 {
	public static void main(String[] args) throws CustomException{
		
		Bank jpChase = new Bank("USD", 1000);
		
		Bank hdfc = new Bank("INR",100);
		Bank icici = new Bank("INR", 120);
		
		System.out.println(hdfc.addValue(icici));
		
		System.out.println(hdfc.addValue(jpChase));
		// this is an example of custom exception
	}

}
