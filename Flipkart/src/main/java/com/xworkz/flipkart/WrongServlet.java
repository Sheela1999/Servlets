package com.xworkz.flipkart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/wrong")
public class WrongServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();

		writer.println("<h1>Wrong Credentials</h1>");
		req.getRequestDispatcher("/login").forward(req, resp);

	}

}
