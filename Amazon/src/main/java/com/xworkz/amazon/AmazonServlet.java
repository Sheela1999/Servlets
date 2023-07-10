package com.xworkz.amazon;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/send")
public class AmazonServlet extends HttpServlet {
	
	public AmazonServlet() {
		System.out.println("This is Amazon Servlet Constructor");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("This do get method of amazon servlet");
	}

}
