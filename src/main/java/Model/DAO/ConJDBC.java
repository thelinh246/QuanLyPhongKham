package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConJDBC {
	private static String url = "jdbc:mysql://localhost:3306/quanlyphongkham";
	private static String user = "root";
	private static String password = "";
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(Connection con) {
		try {
			if(con != null) {
				con.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
