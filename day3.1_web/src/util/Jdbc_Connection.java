package util;
import java.sql.*;

public class Jdbc_Connection {
	private static Connection cn ;
	public static Connection getConnection() throws SQLException {
		if(cn == null) {
			String url = "jdbc:mysql://localhost:3306/jdbcDb?useSSL=false&allowPublicKeyRetrieval=true";
			cn = DriverManager.getConnection(url,"root","12345");
		}
		return cn;
	}
	
}
