package Exceptionpkg;

public class Finallyblock {

	public static void main(String[] args) {
		try{
			System.out.println("wiley");
			//System.exit(0);
			//by using system.exit this flow will not got to finally
			try {
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println("catch block");
				//System.out.println(10/0);
				e.printStackTrace();
			}finally {
				System.out.println("nested try catch");
			}
			System.out.println("edge");
			// TODO Auto-generated method stub
			// while any excpt here will be handled by catch
		}catch(Exception e) {
			System.out.println("catch block");
			// if we'll have a nested try-catch here it will also work
			//System.out.println(10/0);
			e.printStackTrace();
		}finally {
			// any excption here will be handled by main thread
			//System.out.println(10/0);
			System.out.println("from finally");
		}

	}

}
