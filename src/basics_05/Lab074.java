package src.basics_05;

public class Lab074 {
	public static void main(String[] args) {
//		for( ; ; ) {
//			System.out.println("ABCD");
//		}
		// this is a infinite loop
		
//		boolean b1 = true;
//		b1= false;
//		for(;b1;) {
//			System.out.println("abc");
//		}
		// will not print anything as we have given b1 = false
		
		final boolean b1 = true;
		//b1 = false;
		for(;b1;) {
			System.out.println("abc"); //infinite loop
		}
	}

}
