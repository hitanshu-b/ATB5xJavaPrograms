package src.oops_2;

public class BankAccount {
	
	String bankName;
	int balance;
	String bankCode;
	
	BankAccount(){
		bankName = "SBI";
		bankCode = "SBI001";
		System.out.println("Default C");
	}
	
	// Parameterized Constructor
	BankAccount(String bName, String bCode){
		this.bankName = bName;
		this.bankCode = bCode;
		System.out.println("Param C");
	}
	
	void printDetails() {
		System.out.println("BankName: " + bankName);
		System.out.println("BankCode: " + bankCode);
		System.out.println("Balance: " + balance);
	}

}
