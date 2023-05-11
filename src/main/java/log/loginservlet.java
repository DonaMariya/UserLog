package log;


import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class loginservlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("user")&& password.equals("pass"))
		{
			out.println("<html><body>");
			out.println("<h2>Login successful.<h2>");
			out.println("</body></html>");
			
		}
		out.close();
	}
}