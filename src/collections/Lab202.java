package src.collections;

public class Lab202 {
	public static void main(String[] args) {
		temp(123);
		temp("ABC");
		temp(12);
	}
	
	public static <T> void temp(T x) {
		System.out.println(x);
	}

}
