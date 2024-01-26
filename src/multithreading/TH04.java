package src.multithreading;

public class TH04 {
	public static void main(String[] args) {
		
		Runnable w1 = new workerTH4();
		Thread t1 = new Thread(w1);
		t1.start();
		
		Runnable w2 = new workerTH4();
		Thread t2 = new Thread(w2);
		t2.start();
	}

}

class workerTH4 implements Runnable{
	
	

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				System.out.println("---" + Thread.currentThread().getName());
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
}