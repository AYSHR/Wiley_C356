package Wiley_core_java2;
class A{
	public void a() {
		System.out.println("a");
	}
}
class B extends A{
	public void b() {
		System.out.println("b");
	}
}
class C extends A{
	public void c() {
		System.out.println("c");
	}
}
class D extends B{
	public void d() {
		System.out.println("d");
	}
}
class E extends D{
	public void e() {
		System.out.println("e");
	}
}
public class HybridInhr {
public static void main(String[] args) {
	E eo= new E();
	System.out.println("1st branch");
	eo.d();
	eo.b();
	eo.a();
	System.out.println("2nd branch");
	C co= new C();
	co.a();
	co.c();
}
}
