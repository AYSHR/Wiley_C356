package Wiley_core_java2;
interface Person{
	public void getRole();
}
class Teacher implements Person{
public void getRole(){
		System.out.println("teacher");
	}
}
interface Student extends Person{
	public void getRole();
}
class  Classroom extends Teacher implements Student{
	
}
public class DiamondSol {
  public static void main(String[] args) {
	 Classroom cl=new Classroom();
	  cl.getRole();
	 // t=new Teacher();
	 // t.getRole();
}  
}
