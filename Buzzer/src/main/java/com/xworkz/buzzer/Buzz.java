package com.xworkz.buzzer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/press")
public class Buzz extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is Buzzer pressing time");
		
		resp.setContentType("text/HTML");
	    PrintWriter writer = resp.getWriter();
	    
	    req.getRequestDispatcher("/buzzer").forward(req, resp);
	    writer.println("<h1>Plz press the buzzer</h1>");
		
	}

}
