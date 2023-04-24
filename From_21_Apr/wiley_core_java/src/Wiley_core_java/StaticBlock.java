package Wiley_core_java;

public class StaticBlock {
	//initialize static member
	//static block only executes once while instance var is called everytime object is created
	//order:  static-> ins block->const block
  static {
	  System.out.println("static block");
  }
  {
	  System.out.println("ins block");
  }
  public StaticBlock() {
	  System.out.println("constructor");
  }
  public static void main(String[] args) {
	new StaticBlock();
	new StaticBlock();
	new StaticBlock();
	//System.out.println(new StaticBlock());
	//System.out.println(new StaticBlock());
}
}
