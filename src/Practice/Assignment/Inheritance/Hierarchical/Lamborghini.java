package src.Practice.Assignment.Inheritance.Hierarchical;

public class Lamborghini extends Volkswagen{
	
	String modelName;
	double topSpeed;
	
	Lamborghini(String model_name, double top_speed){
		this.modelName = model_name;
		this.topSpeed = top_speed;
	}
	
	void printDetails() {
		System.out.println("Lambo Details: " + modelName + "-->" + topSpeed);
	}
	
	

}
