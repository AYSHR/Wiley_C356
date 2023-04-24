package Wiley_core_java2;
interface Bank{
	void account();
}
interface Bank1{
	void account();
}
interface ATM extends Bank,Bank1{
	void insertcard();
	void selectoption();
	void enterpwd();
}
interface AA{
	void m1();
}
abstract class NewATM implements ATM, AA{
	public void account() {
		
	}
	public void m1() {
		
	}
}
public class InterfaceBank extends NewATM{
	public void insertcard(){
		System.out.println("insertcard");
	}
	public void selectoption() {
		System.out.println("select option");
	}
	public void enterpwd() {
		System.out.println("enter pwd");	
	}
public static void main(String[] args) {
	InterfaceBank ib=new InterfaceBank();
	ib.selectoption();
	ib.insertcard();
}
	
}
