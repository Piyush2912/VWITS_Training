package callableEx;
import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//ExecutorService (submit method), Callable interface, Future class
public class CorrectCallableEx {

	    public static void main(String[] args)
	    {
	 
	    //  new Thread(new MyThread()).start();

	      //ExecutorService ser = new ThreadPoolExecutor();

	    //  ExecutorService ser1 = Executors.newSingleThreadExecutor();
	      ExecutorService ser1 = Executors.newFixedThreadPool(2);
	       Callable<Integer> ob = new MyThread1();

	       Future<Integer> f = ser1.submit(ob);



	       while(!f.isDone()) {
	           System.out.println("Task is still not done...");
	           try {
	                Thread.sleep(200); //in actuality execute some code logic main thread
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	       }
	 
	       System.out.println("Task completed! Retrieving the result");

	           try
	           {
	             System.out.println("Callable thread completed:returned value is:"+f.get());
	             //f.get(20, TimeUnit.SECONDS);
	           }
	           catch(InterruptedException e)
	           {
	               e.printStackTrace();
	           }
	           catch(ExecutionException e)
	           {
	               e.printStackTrace();
	           }



	       Runnable r = new MyThread();

	       ser1.submit(r);

	       ser1.shutdown();
	    }
	 
	}
	 

//	class MyThread implements Runnable
//	{
//
//	    // overriding rule says that opverriden method cannot throw any new or wider checked exception
//
//	    @Override
//	    public void run() //throws SQLException
//	    {
//	        System.out.println("inside Runnable:Current Thread:"+Thread.currentThread().getName());
//	        int add = 10+20;
//	        System.out.println(add);
//	    //    return add;
//	    //    throw new SQLException();
//
//	    }
//	}
	 
	class MyThread1 implements Callable<Integer>
	{

	    // overriding rule says that opverriden method cannot throw any new or wider checked exception

	    @Override
	    public Integer call() throws SQLException
	    {

	        int sum=0;
	        System.out.println("inside Callable:Current Thread:"+Thread.currentThread().getName());
	        for(int i=1;i<20;i++)
	        {
	            sum = sum+i;
	        }


	        return sum;

	    //    throw new SQLException();

	    }
	}