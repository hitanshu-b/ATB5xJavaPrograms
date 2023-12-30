package src.basics_06;

public class Lab099 {
	
	public static void main(String[] args) {
		
		int[] marks = {96, 68, 89, 65};
		
		System.out.println(marks.length);
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		//System.out.println(marks[4]); // Exception > ArrayOutofBound
		
		// we only go in (0 to length - 1) in arrays
		
		int[] a = new int[4];
		// a > [0,0,0,0] > default value of int is 0
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		a[0] = 78;
		
		final int[] b = new int[4];
		b[0] = 75;
		System.out.println(b[0]);
	}

}
