package multithreading1;

public class MyThread11 implements Runnable{
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " i:=" + i);
			
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
				}
		}
	}

}
