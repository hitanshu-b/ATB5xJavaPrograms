package src.oop_concepts;

public class Lab118 {
	
	// it will not run because it is not a main method
//	void main(String[] hitanshu) {
//		System.out.println("Hi");
//	}
	public static void main(String[] args) {
		System.out.println("hi");
		String name = appHits("Hitanshu ");
		System.out.println(name);
		print("Hitanshu");
	}

	static String appHits(String s) {
		System.out.println("return with param");
		return s+"Bagde";
	}
	
	static void print(String s) {
		System.out.println(s);
	}
}
