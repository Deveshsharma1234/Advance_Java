package pages;
import static util.Jdbc_Connection.getConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmpModel;

/**
 * Servlet implementation class ShowEmpServlet
 */
@WebServlet( value="/getAllEmps2",loadOnStartup =1)//for eager loading give loadOnStartup any postive value other then 1
public class ShowEmpServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("in init : "+ Thread.currentThread());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in destroy : "+ Thread.currentThread());

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in doGet of "+ getClass());
		response.setContentType("text/html");
		try {
			String sql = "select * from emp";
			try(Connection cn = getConnection();
					PreparedStatement ps = cn.prepareStatement(sql);
					ResultSet rst = ps.executeQuery();
					PrintWriter pw = response.getWriter();
					)
			{
				pw.println("<html><body>");
				pw.println("<h2>All Employees</h2>");
				pw.println("<table border='1' cellpadding='10'>");
				pw.println("<tr><th>ID</th><th>Name</th><th>Job Title</th><th>Dept</th><th>Salary</th></tr>");

				while(rst.next()) {
				    pw.println("<tr>");
				    pw.println("<td>" + rst.getInt("emp_id") + "</td>");
				    pw.println("<td>" + rst.getString("emp_name") + "</td>");
				    pw.println("<td>" + rst.getString("job_title") + "</td>");
				    pw.println("<td>" + rst.getString("department") + "</td>");
				    pw.println("<td>" + rst.getBigDecimal("salary") + "</td>");
				    pw.println("</tr>");
				}

				pw.println("</table>");
				pw.println("</body></html>");				
			}
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
