package Wiley_core_java;

public class InstanceBlock {
	// instance block called first than constructor
	 String name;
	 int age;
	{ 
		name="harry";
	    age=12;
		System.out.println("isn block called");
	}
	public InstanceBlock() {
		System.out.println("name "+name+ " age "+ age);
		System.out.println("o args");
	}
	public InstanceBlock(int a,int b) {
		System.out.println("sum from 2 args "+ (a+b));
	}
	public static void main(String[] args) {
	new InstanceBlock();
	new InstanceBlock(2,3);
	// ins block called every time object is created
	}
}
