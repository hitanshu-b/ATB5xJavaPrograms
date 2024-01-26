package src.multithreading.generics;

public class MaxThree {
	
	public static <DT extends Comparable<DT>> DT maxNum(DT a, DT b, DT c) {
		DT max = a;
		if(b.compareTo(max) > 0) {
			max = b;
		}
		if(c.compareTo(max) > 0) {
			max = c;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(maxNum(34, 2323, 24));
		System.out.println(maxNum(2.3,2.1,2.0));
		System.out.println(maxNum('d','s','z'));
	}

}
