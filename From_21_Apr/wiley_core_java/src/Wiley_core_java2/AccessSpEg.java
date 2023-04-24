package Wiley_core_java2;

import demo_protected.Drmo_1;

class Specifier extends Drmo_1{
	private int a=98;
	public int b=15;
	protected int c;
	public int get() {
		return a;
	}
}
public class AccessSpEg {
public static void main(String[] args) {
	Specifier s=new Specifier();
	//ConstructType con=new ConstructType();
	Drmo_1 d1 =new Drmo_1();
	System.out.println("public member :"+ s.b);
	System.out.println("private member :"+ s.get() );
	System.out.println("protected member :"+ s.c);
	
	//from different package:- System.out.println("protected member :"+ d1.d);
	
}
}
