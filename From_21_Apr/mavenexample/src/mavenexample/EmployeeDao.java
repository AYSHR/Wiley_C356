package mavenexample;

public interface EmployeeDao {
      
	public void createEmployee(Employee emp);
	
	public void getallEmp();
	public void getdatabyid(int id);
	
	public void updatename(int id, String name);
	
	public void deleterecord(int id);
}
