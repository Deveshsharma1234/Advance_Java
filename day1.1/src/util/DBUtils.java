package util;

import java.sql.*;

public class DBUtils {
	//add a static method to return the db Connection instance
	//not singleton
	
//	public static Connection openConnection () throws SQLException{
//		String url = "jdbc:mysql://localhost:3306/jdbcDb?useSSL=false&allowPublicKeyRetrieval=true";
//		return DriverManager.getConnection(url,"root","12345");
//	}
	
	// Singleton pattern : = Return the same connecton instance (Not scalable)
	//it will be replaced by Connection pool  from hibernet
	private static Connection cn;
	public static Connection openConnection() throws SQLException {
		if(cn == null) {
			String url = "jdbc:mysql://localhost:3306/jdbcDb?useSSL=false&allowPublicKeyRetrieval=true";
			cn = DriverManager.getConnection(url,"root","12345");
		}
		return cn;
	}
	
	

}
