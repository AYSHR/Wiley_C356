package Wiley_core_java2;
class Vehicle{
	public void tier() {
		System.out.println("tier");
	}
	public void steering() {
		System.out.println("steering");
	}
}
class Car extends Vehicle{
	public void airBag() {
		System.out.println("airBag");
	}
}
	class SmartCar extends Car{
		public void sensor() {
			System.out.println("sensor");
		}
	}
public class MultipleInhr {
public static void main(String[] args) {
	SmartCar sc=new SmartCar();
	sc.airBag();
	sc.tier();
	sc.steering();
}
}
