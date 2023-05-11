package log;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import javax.servlet.*;
//import javax.servlet.http.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class registerservlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		if(username.equals("user")&& password.equals("pass"))
		{
			out.println("<html><body>");
			out.println("<h2>Registration successful.<h2>");
			out.println("</body></html>");
			
		}
		
		request.setAttribute("email", email);
		request.setAttribute("password", password);
		request.setAttribute("username", username);
		
		RequestDispatcher rd = request.getRequestDispatcher("Registered");
		rd.forward(request, response);
		out.close();
	}
}
