package Exceptionpkg;
class AgeNotValid extends Exception{
	public AgeNotValid(String msg) {
		super(msg);
	}
	//override
	public String getMessage() {
		return "age not avilable";
	}
	//override
	public String toString() {
		return "age not valid";
	}
}
public class CustomException  {
	public static void getage(int age) throws AgeNotValid {
		try {
			if(age>18) {
				throw new AgeNotValid("age not valid");
			}
			else {
				System.out.println("valid age");
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args)throws AgeNotValid {
		getage(186);
		// TODO Auto-generated method stub

	}

}
