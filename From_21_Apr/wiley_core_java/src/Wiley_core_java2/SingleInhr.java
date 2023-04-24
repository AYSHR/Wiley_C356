package Wiley_core_java2;
class Animal{
	public void eat() {
		System.out.println(" eat");
	}
	public void sleep() {
		System.out.println(" sleep");
	}
}
class Lion extends Animal{
	public void roar() {
		System.out.println(" roar");
	}
}
public class SingleInhr {
public static void main(String[] args) {
	Lion l=new Lion();
	l.sleep();
	l.eat();
	l.roar();
}
}
