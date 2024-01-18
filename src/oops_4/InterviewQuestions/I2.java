package src.oops_4.InterviewQuestions;

public class I2 {
	
	public static void main(String[] args) {
		System.out.println(PP.a);
		foo f = new foo();
		PP f1 = new foo(); // Dynamic Dispatch
		Rofl f2 = new foo();
		f2.say();
		f1.m1();
		f.m1();
	}

}

interface PP{
	int a= 10;
	
	void m1();
}

abstract class Rofl implements PP{
	abstract void say();
}

class foo extends Rofl{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("say");
	}
	
}