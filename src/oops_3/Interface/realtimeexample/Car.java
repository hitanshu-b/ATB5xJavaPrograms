package src.oops_3.Interface.realtimeexample;

public class Car implements Engine, Brake{
	
	void start() {
		startEngine();
	}

	@Override
	public void startEngine() {
		System.out.println("engine started");
	}

	@Override
	public void brakes() {
		System.out.println("Brakes are working fine");
	}

}
