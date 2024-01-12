package src.oops_2.Inheritance.hierarchical;

public class Vehicle {
	
	Vehicle(){
		System.out.println("DC >> Vehicle");
	}
	
	void vehicleTopSpeed() {
		System.out.println("Yeah from" +getClass().getSimpleName());
	}

}
