package Exceptionpkg;

interface example {
	public abstract void show() throws ArithmeticException;
}

public class InterfaceException implements example {
	public void show() throws ArithmeticException {
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		InterfaceException ie =new InterfaceException();
		ie.show();
		System.out.println("successfully printed exception");

	}

}
