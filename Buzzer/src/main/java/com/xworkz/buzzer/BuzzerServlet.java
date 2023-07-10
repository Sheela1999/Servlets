package com.xworkz.buzzer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class BuzzerServlet extends HttpServlet {
	
	public BuzzerServlet() {
		System.out.println("This is Buzzer servlets..");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Buzzer is having Do Get method");
	}

}
