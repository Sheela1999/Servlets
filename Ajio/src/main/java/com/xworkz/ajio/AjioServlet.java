package com.xworkz.ajio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/pallavi", loadOnStartup = 1)
public class AjioServlet extends HttpServlet {
	
	public AjioServlet() {
		System.out.println("This is a constructor");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("This Ajio Do get method");
		
		 String username = req.getParameter("name");
		 String email = req.getParameter("email");
		 
		 System.out.println(username);
		 System.out.println(email);
		
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println("<h2>Go Back!</h2>");
		
		writer.println("<h1>"+""+username+" "+"<h1>"+ email);
	}

}
