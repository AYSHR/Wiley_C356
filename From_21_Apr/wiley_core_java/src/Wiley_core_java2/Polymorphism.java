package Wiley_core_java2;
class Parent{
	//compile time 
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(float a,float b) {
		System.out.println(a+b);
	}
}
class Child extends Parent{
	//run time
	public void add(int a,int b) {
		System.out.println("add with 10 in child :"+(a+b+10));
	}
}
public class Polymorphism {
public static void main(String[] args) {
	Parent p=new Parent();
	p.add(2, 3);
	p.add(5.2f,3.1f);
	Child c=new Child();
	c.add(3, 2);
}
}
