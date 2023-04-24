package Exceptionpkg;

import java.util.ArrayList;

class StringNotFound extends Exception{
	public StringNotFound(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "string not available";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "string not present";
	}

	
}
public class UnChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> na=new ArrayList<>();
  na.add("rose");
  na.add("rose1");
  na.add("rose2");
  if(!na.contains("wed")) {
	  try {
		  throw new StringNotFound("string not found");
	  }catch(StringNotFound e) {
		  e.printStackTrace();
		  System.out.println(e.getMessage());
		  System.out.println(e.toString());
	  }
  }
  System.out.println("msg 2");
	}

}
