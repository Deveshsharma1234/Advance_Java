package pages_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// extends httpServlet class an abstract class with 100% implemented methods

@WebServlet("/test")//attribute to map our servlet when "/test" in url then this will gets called
public class HellowWorldServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("in doGet : invoked by "+ Thread.currentThread());
		// set response Content type
		//Method of httpServletREspoonse: public void setContentType(String contentType)
		resp.setContentType("text/html");
		//To send resp from server --> i.e send resp body : get writer instance from http resp
		try(PrintWriter pw = resp.getWriter()){
			pw.print("Welocome to Servlet @"+LocalDateTime.now());//res body
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("in destroy : invoked by "+ Thread.currentThread());

	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("in init : invoked by "+ Thread.currentThread());
	}
	

}
