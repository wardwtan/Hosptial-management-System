package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class mysql_config {
	public static Connection createConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","root");
		return con;
	}
}
