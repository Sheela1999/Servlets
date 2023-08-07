package com.xworkz.flipkart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/welcome")
public class FlipkartServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Welcome to Flipkart Online Shopping");

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();

		writer.println(" <form action=\"Fi\" method=\"get\">\r\n" + "  UserName\r\n"
				+ "  <input type=\"text\" value=\"name\">\r\n" + "  Password\r\n"
				+ "  <input type=\"text\" value=\"password\">\r\n"
				+ "  <button type=\"submit\" value=\"submit\">Submit</button>\r\n" + " \r\n" + "  </form>");
		req.getRequestDispatcher("/FlipkartServlet").forward(req, resp);
		writer.println("<h1>To login create accout.</h1>");

	}
}
