package src.oops_3.accessModifiers.criminal;

import src.oops_3.accessModifiers.police.Cop;

public class Thief {
	
	public static void main(String[] args) {
		Cop c = new Cop(10);
		System.out.println(c.gun);
		// c.canIShoot();
		// Not allowed to access canIShoot() as it is not in the Police Folder
	}

}
