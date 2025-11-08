package tester;

import java.sql.*;

import model.EmpModel;

import static util.DBUtils.openConnection;;

public class TestPreparedStatement {
	public static void main(String[] args) throws SQLException {
		String sql = "Select * from my_emp";
		try (Connection cn = openConnection();
				PreparedStatement st = cn.prepareStatement(sql);
				ResultSet rst = st.executeQuery(sql);) {
			
				while (rst.next()) {
					EmpModel emp = new EmpModel();
					emp.setEmp_id(rst.getInt("emp_id"));
					emp.setName(rst.getString("emp_name"));
					emp.setJobTitle(rst.getString("job_title"));
					emp.setDept(rst.getString("department"));
					emp.setSal(rst.getBigDecimal("salary"));
					System.out.println(emp.toString());
				}
			

		}
	}

}
