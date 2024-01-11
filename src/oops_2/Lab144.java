package src.oops_2;

public class Lab144 {
	
	public static void main(String[] args) {
		
		BankAccount sbi = new BankAccount();
		sbi.printDetails();
		
		System.out.println("-----------");
		
		BankAccount hdfc = new BankAccount("HDFC", "HDFC002");
		hdfc.printDetails();
		
		System.out.println("-----------");
		
		BankAccount icici = new BankAccount("ICICI", "ICICI003");
		icici.printDetails();
	}

}
