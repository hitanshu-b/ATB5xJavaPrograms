package src.basics_06;

public class Lab100 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		System.out.println(arr1 == arr2);
		// though the values are same but 
		//the location or address or reference or memory allocation
		//in which they are stored are different
		
		int[] arr3 = arr1;
		System.out.println(arr1 == arr3); // they are equal as array1 is already defined
		
		System.out.println(arr1.equals(arr2));
		//
		arr3[0] = 34;
		System.out.println(arr1[0]);
		System.out.println(arr3[0]);
	}
}
