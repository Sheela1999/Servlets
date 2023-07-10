package com.xworkz.bamboo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class BambooServlet extends HttpServlet {
	
	public BambooServlet() {
		System.out.println("This is bamboo servlets...");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Bamboo is a tree and its do get method");
		
	}

}
