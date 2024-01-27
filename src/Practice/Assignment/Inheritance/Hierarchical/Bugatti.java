package src.Practice.Assignment.Inheritance.Hierarchical;

public class Bugatti extends Volkswagen{
	
	String modelName;
	int yearFound;
	
	Bugatti(String model_name, int year_found){
		this.modelName = model_name;
		this.yearFound = year_found;
	}
	
	void printBugatti() {
		System.out.println("Bugatti Details: " + modelName + "-->" + yearFound);
	}

}
