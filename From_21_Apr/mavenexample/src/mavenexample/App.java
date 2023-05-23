package mavenexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {


    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyclassic", "root", "root")) {
            String sqlQuery = "SELECT firstName FROM employees";
            PreparedStatement stmt = con.prepareStatement(sqlQuery);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                System.out.println(rs.getString("firstName"));
            }
            
            System.out.println("Query executed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
