package src.Practice.Assignment.Inheritance.Hierarchical;



public class Volkswagen {
	
	String childCompany;
	int foundingYear;
	
	public Volkswagen() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Company Name: ");
//		this.childCompany = sc.next();
//		
//		System.out.println("Enter year: ");
//		this.foundingYear = sc.nextInt();
//		sc.close();
	}
	
	
	void displayDetails() {
		System.out.println("Company Details: " + childCompany + "-->" +foundingYear);
	}

}
