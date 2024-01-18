package src.oops_4.InterviewQuestions;

public class I1 {
	public static void main(String[] args) {
		System.out.println(H.a);
		//H.m1();
		abc a = new abc();
		a.m1();
	}

}


interface H{
	// Only Static Variables
	
	// in interface there are only "public static final" variables
	// public static final int a = 10;
	public static final int a = 10;
	int b = 23;
	void m1(); // this is non static 
}

class abc implements H{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("ABC");
		
	}
	
}