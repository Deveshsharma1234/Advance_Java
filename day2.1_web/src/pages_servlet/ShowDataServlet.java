package pages_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowDataServlet
 */
@WebServlet("/displayData")
public class ShowDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("in intit :"+ Thread.currentThread());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in Destroy :"+ Thread.currentThread());

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		  String name = request.getParameter("name");
	        String color = request.getParameter("color");
	        String browser = request.getParameter("browser");
		try(PrintWriter pw = response.getWriter()){
			pw.print("<h2>Submitted Data</h2>");
			pw.print("<h2>Hello, My Name is </h2>"+ "<h1>"+ name + "</h1>" );
			pw.print("<p>Favourite Color: " + color + "</p>");
			pw.print("<p>Selected Browser: " + browser + "</p>");
			
		}
	}
}
