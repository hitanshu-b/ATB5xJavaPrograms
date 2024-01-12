package src.oops_2.Inheritance.multilevel;

public class Lab148 {
	
	public static void main(String[] args) {
		GrandFather g = new GrandFather();
//		g.bhk3();
		Father f = new Father();
		Son s = new Son();
		
		GrandFather g1 = new Son();
		g.bhk3();
		Father f2 = new Son();
		//Son s2 = new GrandFather();
		// Son s2 = new Father();
		
		Son s1 = new Son();
		s.bhk1();
		s.bhk2();
		s.bhk3();
	}

}
