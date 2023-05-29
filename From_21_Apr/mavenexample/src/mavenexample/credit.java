package mavenexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class credit {

	public static void getall() {

		try {
			Connection con = DBConnection.createConnection();

			String sql = "SELECT * FROM customerAccount ";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.format(" id balance loan emi %d\t%d\t%s\t%f\t", rs.getInt(1), rs.getInt(2), rs.getString(3),
						rs.getDouble(4));

				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static double viewBalance(int id) {
		double availableBalance = 0.0;
		try {
			Connection con = DBConnection.createConnection();

			// if viewBalance() < amount
			// System.out.println("withdrawal fail because of low balance ");
			String query = "SELECT customerBalance FROM customerAccount WHERE customerId=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				availableBalance = rs.getDouble(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return availableBalance;
	}

	public static void addAmount(int amount, int customerId) {
		try {
			Connection con = DBConnection.createConnection();
			System.out.println("Adding amount: " + amount + " for customerId: " + customerId);

			String sql = "UPDATE customerAccount SET customerBalance = (customerBalance + ?) WHERE customerId=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, amount);
			stmt.setInt(2, customerId);

			int count = stmt.executeUpdate();
			if (count != 0) {
				System.out.println("Credited INR " + amount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void withdrawal(int amount, int customerId) {
		try {
			Connection con = DBConnection.createConnection();
			double availableBalance = viewBalance(customerId);
			if (availableBalance < amount) {
				System.out.println("Withdrawal failed due to insufficient balance");
				return;
			}

			String sql = "UPDATE customerAccount SET customerBalance = (customerBalance - ?) WHERE customerId=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, amount);
			stmt.setInt(2, customerId);
			int count = stmt.executeUpdate();
			if (count != 0) {
				System.out.println("Debited INR " + amount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println(viewBalance(2));
		getall();
		addAmount(1500, 2);
		getall();
		addAmount(500, 2);
		addAmount(500, 2);
		getall();
		withdrawal(1000, 2);
		getall();
	}

}
