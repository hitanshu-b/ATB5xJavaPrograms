package src.oops_4.InterviewQuestions;

public class Abstract01 {

}

abstract class Person01{
	
	abstract void say();
	
	void eat() {
		System.out.println("eat");
	}
}

abstract class Student1 extends Person01{
	abstract void m1();
	
	
}

class Ramesh extends Student1{

	@Override
	void say() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}
	
}