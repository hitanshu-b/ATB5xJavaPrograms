package src.basics_06;

public class Lab104 {

	public static void main(String[] args) {
		
		int[] int_array = {1,2,3,4,5};
		float[] float_array = {12.23f,12.12f,11.11f};
		double[] double_array = {34.4, 43.2, 23.2};
		
		boolean[] bool_array = {true, false, true};
		char[] char_array = {'A', 'B', 'C'};
		String[] names = {"ABCD", "ABCDE"};
		
		System.out.println(int_array.length);
		System.out.println(names.length);
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
