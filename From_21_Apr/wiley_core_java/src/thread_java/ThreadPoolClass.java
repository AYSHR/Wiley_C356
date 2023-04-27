package thread_java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PoolClass extends Thread{
	 public void run() {
		  System.out.println("thread name : "+Thread.currentThread().getName());
	  }
	  }

public class ThreadPoolClass extends Thread{
 
	public static void main(String[] args) {
	//	ExecutorService executor= Executors.newFixedThreadPool(4);
		//cached thread pool automatically assign size by jvm as per requirement
		ExecutorService executor= Executors.newCachedThreadPool();
		for(int i=1;i<=100;i++) {
			executor.execute(new PoolClass());
		}
	}

}
