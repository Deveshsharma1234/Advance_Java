//package tester;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class TestDBConnection {
//	public static void main(String[] args) {
//		// Load MySql Connector (JDBC Driver Class in method are): OPTIONAL
//		try {
////			Class.forName("com.mysql.cj.jdbc.Driver");
//			String url = "jdbc:mysql://localhost:3306/jdbcDb?useSSL=false&allowPublicKeyRetrieval=true";
////			API of java.sql.DriverManager class
//			//public static Connection getConnection(String url ,userName, Strign pwd)throw SQLExection
//			try(Connection cn = DriverManager.getConnection(url,"root","12345")){
//				System.out.println("Connect To Db"+ cn);
//				cn.createStatement();
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//}
