package thread_java;

class Parent{
	public void m1() {
		System.out.println("m1 method");
	}
}
class T2 extends Parent implements Runnable{

	@Override
	public void run() {
		m1();
		System.out.println("by runnable interface");
		
	}
	
}
class T1 extends Thread{
	public void run(){
		System.out.println("by thread class");
	}
}
public class Thread_class {

	public static void main(String[] args) {
		T1 t1=new T1();
		t1.start();
		T2 t2=new T2();
		Thread trd=new Thread(t2);
		trd.start();
	}

}
