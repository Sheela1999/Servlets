package com.xworkz.buzzer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/buzzer")
public class BuzzerServlet extends HttpServlet {
	
	public BuzzerServlet() {
		System.out.println("This is Buzzer servlets..");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("Buzzer is having Do Get method");
		
		resp.setContentType("text/HTML");
	    PrintWriter writer = resp.getWriter();
	    
	    writer.println(" <form action=\"buzzer\" method=\"post\">\r\n"
	    		+ "  UserName\r\n"
	    		+ "  <input type=\"text\" value=\"name\">\r\n"
	    		+ "  Password\r\n"
	    		+ "  <input type=\"text\" value=\"password\">\r\n"
	    		+ "  <input type=\"submit\" value=\"submit\">");
	}

}
