package src.Practice.Assignment.Inheritance.Hierarchical;

public class HierarchicalRC {
	public static void main(String[] args) {
		Volkswagen v = new Volkswagen();
		Lamborghini l1 = new Lamborghini("Gallardo",220);
		Bugatti b1 = new Bugatti("Veryon",1967);
		
		v.displayDetails();
		l1.printDetails();
		b1.printBugatti();
	}

}
