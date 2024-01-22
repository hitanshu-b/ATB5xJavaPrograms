package src.oops_5;

public class Lab172 {
	public static void main(String[] args) {
		
		extracted(0);
	}

	private static void extracted(int b) {
//		int a;
//		if(b == 0) {
//			throw new ArithmeticException("B can't be zero");
//		} else {
//			a = 10/0;
//		}
//
//		System.out.println(a);
		try {
			int a = 10/b;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
