package src.oops_4.InnerClass;

public class Lab158 {
	
	public static void main(String[] args) {
		Thread t = new Thread();
		
		Thread t1 = new Thread() {
			// Anonymous class implmentation
			@Override
			public void run() {
				System.out.println("This is a thread");
			}
		};
		t1.run();
	}

}
