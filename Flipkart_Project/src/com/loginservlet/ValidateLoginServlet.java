package com.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flipkart.connection.FlipkartDAO;



@WebServlet("/ValidateLoginServlet")
public class ValidateLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ValidateLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FlipkartDAO fd = new FlipkartDAO();
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String email = request.getParameter("Email");
		String pwd = request.getParameter("Password");
		
		try {
				if(fd.read(email, pwd)==true) {
					response.sendRedirect("Home.jsp");
					session.setAttribute("user", email);
					session.setAttribute("welcome", email);
				}
				else {
					out.println(email+" "+pwd);
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
