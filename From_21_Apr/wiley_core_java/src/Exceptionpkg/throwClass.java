package Exceptionpkg;

public class throwClass {
public static void m1() throws InterruptedException {
	m2();
}
public static void m2() throws InterruptedException {
	Thread t =new Thread();
	t.sleep(1000);
}
	public static void main(String[] args)throws InterruptedException {
		m1();

	}

}
