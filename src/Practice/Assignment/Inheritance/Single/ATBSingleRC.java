package src.Practice.Assignment.Inheritance.Single;

public class ATBSingleRC {
	
	public static void main(String[] args) {
		ATBSingleParent p1 = new ATBSingleParent(110023, "ATB5x");
		ATBSingleChild c1 = new ATBSingleChild("Andrew", 4);
		
		p1.displayDetails();
		c1.printInfo();
	}
	
}
