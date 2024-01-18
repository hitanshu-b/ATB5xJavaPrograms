package src.oops_4.InnerClass;

public class Lab154 {
	public static void main(String[] args) {
		Car c = new Car("Lambo");
		// this is how we access the inner class
		// Syntax::
		// OC.IC ref = OCRef.new IC();
		
		Car.Engine eng = c.new Engine("400hp");
		eng.Start();
		c.drive();
	}

}

class Car{
	
	String make; // Instance variable
	
	// Parameterized Constructor
	
	public Car(String make) {
		this.make = make;
	}
	
	void drive() {
		System.out.println("Drive the car");
	}
	
	public class Engine{
		String horsepower;
		
		public Engine(String horsepower) {
			this.horsepower = horsepower;
		}
		
		void Start(){
			System.out.println("Start");
		}
	}
}