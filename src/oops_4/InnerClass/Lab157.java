package src.oops_4.InnerClass;

public class Lab157 {
	
	public static void main(String[] args) {
		Student s1 = new Student() {

			@Override
			public void setId() {
				
			}	
		};
	}

}

abstract class B{
	int var_b = 12;
}

interface Student {
	int id = 11;
	void setId();
}