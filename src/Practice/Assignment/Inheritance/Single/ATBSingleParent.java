package src.Practice.Assignment.Inheritance.Single;

public class ATBSingleParent {
	
	int rollNo;
	String courseName;
	
	ATBSingleParent() {
		System.out.println("Default Constructor --> Parent");
	}
	
	ATBSingleParent(int roll_No, String course_Name) {
		this.rollNo = roll_No;
		this.courseName = course_Name;
	}
	
	void displayDetails() {
		System.out.println("Enrolled Student Details: " + rollNo + " " + courseName);
	}

}
