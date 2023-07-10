package com.xworkz.ajio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send" ,loadOnStartup = 2)
public class ShoppingServlet extends HttpServlet {
	
	public ShoppingServlet() {
		System.out.println("This is Shopping Constructor....");
		
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("this is do get Method..");
		
		String username = req.getParameter("name");
		 String email = req.getParameter("email");
		 
		 System.out.println(username);
		 System.out.println(email);
		
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println("<h2>Go Back!</h2>");
		
		writer.println("<h1>"+""+username+" "+"<h1>"+ email);
		
		writer.println("<h1><form>\r\n"
               + " <input type=\"button\" value=\"Go back!\" onclick=\"history.back()\">\r\n"
		       + "</form>");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("This is do post method...");
	}
	
    @Override
	public void doPut(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("This is do put method....");
	}

    @Override
    public void doHead(HttpServletRequest req, HttpServletResponse resp) {
    	System.out.println("This is do HEAD method.....");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) {
    	System.out.println("This is do DELETE method......");
    }

}
