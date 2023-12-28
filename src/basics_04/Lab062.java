package src.basics_04;

public class Lab062 {
	public static void main(String[] args) {
		//Only works after jdk 13
		int itemcode = 007;
		switch(itemcode) {
		case 001, 002, 003:
			System.out.println("It is an electronic gadget");
			break;
		case 004, 005:
			System.out.println("It is a mechanical device");
		default:
			System.out.println("It is a software product");
		}
	}

}
