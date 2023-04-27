package thread_java;

class TPriority extends Thread{
	public void run(){
		for(int i=1;i<11;i++) {
			System.out.println(i+" "+
					"name of thread : "+ Thread.currentThread().getName()+" "+
				"  priority of thread : "+Thread.currentThread().getPriority() +
				"  thread id : "+Thread.currentThread().getId());
		}
	}
}
public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Thread.currentThread().setPriority(1); TPriority t1=new TPriority();
		 * t1.setPriority(10);
		 */
		TPriority t1=new TPriority();
		TPriority t3=new TPriority();
		TPriority t2=new TPriority();
		t1.setName("fisrt thread");
		t1.start();
		t1.join();
		System.out.println(t1.getState());
		t2.start();
		t2.join();
		System.out.println(t2.getState());
		t3.start();
		
	}

}
