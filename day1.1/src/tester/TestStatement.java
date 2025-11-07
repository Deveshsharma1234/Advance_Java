package tester;
import static util.DBUtils.openConnection;
import java.sql.*;

import model.EmpModel;



public class TestStatement {

	public static void main(String[] args) {
		try(Connection cnn = openConnection();
				Statement st = cnn.createStatement();
				ResultSet rst = st.executeQuery("select * from my_emp");
				)
		{
			System.out.println("Exection of query started");
			while(rst.next()) {
//				System.out.println(rst.toString());
				  EmpModel emp = new EmpModel();
				    emp.setEmp_id(rst.getInt("emp_id"));
				    emp.setName(rst.getString("emp_name"));
				    emp.setJobTitle(rst.getString("job_title"));
				    emp.setDept(rst.getString("department"));
				    emp.setSal(rst.getBigDecimal("salary"));
				    emp.setHireDate(rst.getDate("hire_date"));
				    System.out.println(emp.toString());				
			}
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
