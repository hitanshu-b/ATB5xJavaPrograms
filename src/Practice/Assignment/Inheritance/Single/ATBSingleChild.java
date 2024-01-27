package src.Practice.Assignment.Inheritance.Single;

public class ATBSingleChild extends ATBSingleParent {
	
	String name;
	double expYears;
	
	public ATBSingleChild(String student_name, double exp_in_years) {
		this.name = student_name;
		this.expYears = exp_in_years;
	}
	
	void printInfo() {
		System.out.println("Enrolled Student Details: "+ name + " " + expYears);
	}

}
