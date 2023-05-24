package mavenexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
   public static Connection createConnection() throws SQLException {
	
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyclassic", "root", "root");
		   return con;
			  
   }
}
