package src.oops_4.InnerClass;

public class Lab156 {
	public static void main(String[] args) {
		ABC a = new ABC();
		ABC.iPAD ip = a.new iPAD();
		ip.eat();
	}
	
}

class ABC {
	int age = 31;
	
	void say() {
		System.out.println("I am saying");
	}
	
	class iPAD{
		void eat() {
			System.out.println("Eating");
			System.out.println(age);
		}
	}
}