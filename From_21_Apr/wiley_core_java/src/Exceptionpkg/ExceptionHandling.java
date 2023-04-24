package Exceptionpkg;

public class ExceptionHandling {

	public static void main(String[] args) {
		int arr[]={1,2,3};
		// TODO Auto-generated method stub
   try {
	   System.out.println(arr[0]);
	   String s="ambigous";
	   System.out.println(s.charAt(10));
	   //after catching error it won't go ahead in try
   }catch(ArrayIndexOutOfBoundsException e) {
	   System.out.println(e.getMessage());
	   System.out.println(e.toString());
	   e.printStackTrace();
   }catch(IndexOutOfBoundsException ae) {
	   ae.printStackTrace();
   }catch(Exception ae) {
	   ae.printStackTrace();
   }
   System.out.println("after excption");
	}

}
