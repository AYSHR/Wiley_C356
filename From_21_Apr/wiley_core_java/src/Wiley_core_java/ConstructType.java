package Wiley_core_java;

public class ConstructType {
   public ConstructType() {
	   System.out.println("0 args const");
   }
   public ConstructType(int a, int b) {
	  // this will acll const
	   this(5.3f,4);
	   System.out.println("2 args const" +a +" " +b);
     //if we call this here it'll won't work
   }
   public ConstructType(float a, int b) {
	   System.out.println("2 dff. args const" +a +" " +b);
  }
   public static void main(String[] args) {
	   new ConstructType();
	    new ConstructType(2,3);
	 new ConstructType(2.2f,3);

	   
}
}
