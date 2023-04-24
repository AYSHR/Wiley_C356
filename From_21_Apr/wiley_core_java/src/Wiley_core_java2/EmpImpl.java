package Wiley_core_java2;
class Employee{
	private String name;
	private int age;
	public void setVlaue(String n, int a) {
		this.name=n;
		this.age=a;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
}
class Emp {
	public void show(Employee emp) {
		System.out.println("calling from sub class");
	System.out.println("Name: "+ emp.name+"Age: "+emp.age);
	}
}
public class EmpImpl {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setVlaue("wiley",2);
	Emp e =new Emp();
	System.out.println(emp.getAge());
	e.show(emp);
}
}
