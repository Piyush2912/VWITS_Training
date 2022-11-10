package futureexample;

import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class assignment {
	public static void main(String args[]) {
		ExecutorService se1 = Executors.newFixedThreadPool(2);
		
		Callable<Integer> ob = new MyThread1();
		Future<Integer> f =  ser1.submit();
		
		Callable<Integer> ob1 = new MyThread2();
		Future<Integer> f1 = ser1.submit(ob1);
		
		while(!f.isDone()) {
			System.out.println("MyThread1 Task is still not complete..");
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}catch(ExecutionException e) {
				e.printStackTrace();
			}
		}
		while(!f1.isDone()) {
			System.out.println("MyThread2 Task is still not complete...");
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		if(f1.isDone() && !f1.isCancelled()) {
			System.out.println("MyThread2 Task completed! Retrieving the result");
		}
		try {
			System.out.println("MyThread2 Callable thread completed: returned value is:" + f1.get());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(ExecutionException e) {
			e.printStackTrace();
		}
		
		for(int k=0;k<100;k++) {
			System.out.println("Main Thread value of k=" + k);
		}
		
		
	}
	
	class MyThread1 implements Callable<Integer> {
		@Override
		public Integer call() throws Exception{
			int sum = 0;
			for(int i=0; i<100; i++) {
				Thread.sleep(1000);
				System.out.println("Running MyThread1 Value of i=" + i);
				sum += i;
			}
			Thread.sleep(5000);
			return sum;
		}
	}
	class MyThread2 implements Callable<Integer> {
		@Override
		public Integer call() throws Exception{
			int sum = 0;
			for(int j=0; j<50; j++) {
				Thread.sleep(1500);
				System.out.println("Running MyThread2 Value of j=" + j);
				sum += j;
			}
			Thread.sleep(3000);
			return sum;
		}
	}
	
}