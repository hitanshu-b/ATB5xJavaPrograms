package src.basics_05;

public class Lab079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print the value of i, but I want to break when i = 5");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Val of "+ i);
            if( i ==5){
                break;
            }
            // System.out.println("Val of "+ i);
        }

        System.out.println("End");

	}

}
