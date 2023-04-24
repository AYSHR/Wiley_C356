package Wiley_core_java2;
abstract class Test1{
	{
		System.out.println("test1 instance block");
	}
	static {
		System.out.println("tset1 static block");
	}
	//abstract method can be defined inside abstract class
	public abstract void m1();
	public  void m2() {
		System.out.println("m2");
	};
	//we can create constructor in abstract class
	public static void main(String args[]) {
		System.out.println("main from abstract class");
	}
	public Test1(){
		System.out.println("test1 constructor");
	}
}
//constructor can't be abstract
class Test2 extends Test1{
	{
		System.out.println("test2 instance block");
	}
	static {
		System.out.println("tset2 static block");
	}
	public  void m1() {
		System.out.println("m1");
	}
	public Test2(){
		System.out.println("test2 constructor");
	}
}
public class AbstractionClass {
public static void main(String args[]) {
	Test2 t2=new Test2();
	Test2 t3=new Test2();
	t2.m1();
	t2.m2();
	t2.main(args);
}
}
