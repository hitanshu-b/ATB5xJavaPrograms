package src.basics_04;

public class Lab063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDK > 13
        // -> automatically adds break

        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

	}

}
