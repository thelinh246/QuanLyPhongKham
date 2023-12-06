package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonDAO {
	public PersonDAO() {}
	public boolean isValidUser(String username, String password) {
		try {
			Connection con = ConJDBC.getConnection();
			String query = "SELECT Username, Password FROM person";
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				String user = rs.getString("Username");
				String pass = rs.getString("Password");
				if (username == user && password == pass) {
					ConJDBC.closeConnection(con);
					return true;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
