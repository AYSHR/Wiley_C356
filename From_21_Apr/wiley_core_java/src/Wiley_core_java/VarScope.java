package Wiley_core_java;

public class VarScope {
	int val=5;
	int val1=2;
  int ins=5;
  public void sum() {
	  int val=15;
		int val1=12;
		System.out.println("sum of loc : "+(val+val1));
		System.out.println("sum of ins : "+(this.val+ this.val1));
  }
  static String st= "rose";
  public static void main(String[] args) {
	 int loc=9;
	 //this can't be used in static area which is main method also
	 VarScope v=new VarScope();
	 System.out.println("loc "+ loc);
	 System.out.println("ins "+ v.ins);
	 System.out.println("static "+ st);
	 v.sum();
	 
}
}
