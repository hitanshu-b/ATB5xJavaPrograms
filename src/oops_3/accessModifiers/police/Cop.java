package src.oops_3.accessModifiers.police;

public class Cop {
	
	public int gun;

	public Cop(int gun) {
		this.gun = gun;
	}
	
	protected void canIShoot() {
		System.out.println("You can shoot");
	}

}
