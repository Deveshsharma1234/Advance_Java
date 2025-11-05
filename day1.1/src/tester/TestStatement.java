package tester;
import static util.DBUtils.openConnection;
import java.sql.*;



public class TestStatement {

	public static void main(String[] args) {
		try(Connection cnn = openConnection();
				Statement st = cnn.createStatement();
				ResultSet rst = st.executeQuery("select * from my_emp");
				)
		{
			while(rst.next()) {
				
				
			}
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
