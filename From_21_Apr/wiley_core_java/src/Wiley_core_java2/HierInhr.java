package Wiley_core_java2;
class Vehicle1{
	public void tier() {
		System.out.println("tier");
	}
}
class Car1 extends Vehicle1{
	public void airBag() {
		System.out.println("airBag");
	}
}
class Truck extends Vehicle1{
	public void HydraulicPump() {
		System.out.println("HydraulicPump");
	}
}
public class HierInhr {
public static void main(String[] args) {
	Truck t=new Truck();
	 Car1 c =new  Car1();
	t.HydraulicPump();
	t.tier();
	c.tier();
	
}
}
