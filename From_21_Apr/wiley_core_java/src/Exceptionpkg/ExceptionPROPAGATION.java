package Exceptionpkg;

public class ExceptionPROPAGATION {

	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("exception caught: "+ e.getMessage());
		}

	}

	public static void method1() throws Exception {
		// TODO Auto-generated method stub
		method2();
	}
	public static void method2() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("exception occured in method 2");
	}

}
