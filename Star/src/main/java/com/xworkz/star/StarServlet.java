package com.xworkz.star;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class StarServlet extends HttpServlet {
	
	public StarServlet() {
		System.out.println("This is Star Servlet..");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("This is do get method");
	}

}
