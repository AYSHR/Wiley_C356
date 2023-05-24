package mavenexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeImpl implements EmployeeDao {

	@Override
	public void createEmployee(Employee emp) {
		
		try {
			Connection con=DBConnection.createConnection();
			
			String sql="INSERT INTO employee VALUES(?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1,emp.getId());
			stmt.setString(2,emp.getName());
			stmt.setDouble(3,emp.getSalary());
			stmt.setInt(4,emp.getAge());
			int count= stmt.executeUpdate();
			if(count !=0) {
				System.err.println("employee data inserted");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void getallEmp() {
		System.out.format("%s\t%s\t%s\t%s\t","id","name","salary","age");
        System.out.println();
		System.out.println("------------------");
		try {
			Connection con=DBConnection.createConnection();
			
	String sql="SELECT * FROM employee ";
	PreparedStatement stmt=con.prepareStatement(sql);
	ResultSet rs= stmt.executeQuery(sql);
	while(rs.next()) {
		System.out.format("%d\t%s\t%f\t%d\t", rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
	    System.out.println();
		System.out.println("------------------");
	}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void getdatabyid(int id) {
		System.out.format("%s\t%s\t%s\t%s\t","id","name","salary","age");
	    System.out.println();
		System.out.println("------------------");
		try {Connection con=DBConnection.createConnection();
		
			String sql=("SELECT * FROM employee WHERE id= "+id);
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\t", rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
			    System.out.println();
				System.out.println("------------------");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	public void updatename(int id, String name) {
		System.out.format("%s\t%s\t%s\t%s\t","id","name","salary","age");
	    System.out.println(); 
		System.out.println("------------------");
		try {
			Connection con=DBConnection.createConnection();
			
			String sql="UPDATE employee SET name=? WHERE id=?  ";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,name);
			stmt.setInt(2, id);
			int count= stmt.executeQuery(sql);
			
			 if(count!=0) { System.out.println("data updated successfully"); }
			
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	public void deleterecord(int id)  {
		try {
			Connection con=DBConnection.createConnection();
			
			String sql="DELETE employee WHERE id=? ";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, id);
			int count= stmt.executeQuery(sql);
			if(count!=0) {
				System.out.println("data DELETED successfully");
			}
		}
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
	}

}

