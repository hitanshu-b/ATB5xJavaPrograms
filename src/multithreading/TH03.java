package src.multithreading;

public class TH03 {
	
	public static void main(String[] args) {
		
		ThreadGroup th = new ThreadGroup("Workers");
		
		workerTH w = new workerTH(th, "W1");
		w.start();
		
		workerTH w2 = new workerTH(th, "W2");
		w2.start();
	}

}

class workerTH extends Thread{
	
	workerTH(ThreadGroup th, String name){
		super(th,name);
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
}