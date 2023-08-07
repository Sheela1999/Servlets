package com.xworkz.flipkart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/login", initParams = { @WebInitParam(name = "name", value = "Nikitha"),
		@WebInitParam(name = "password", value = "123456") })

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Login SuccessFull");

		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		// writer.println("<h1>" +" " +userName + " "+ password + " " + "</h1>");

		String rightUserName = getInitParameter("name");
		String rightPassword = getInitParameter("password");

		if (!userName.isEmpty() && !password.isEmpty()) {
			System.out.println("Inputs are valid");
			if (userName.equals(rightUserName) && password.equals(rightPassword)) {
				System.out.println("Credentials are valid");
				req.getRequestDispatcher("/Welcome.jsp").forward(req, resp);
				writer.println("<h1>Login Success..</h1>");
			} else {
				req.getRequestDispatcher("/Login.jsp").include(req, resp);
				writer.print("<h3> Credentials are wrong, try it again</h3>");
				System.out.println("userName and Passwords are wrong");
			}
		}
	}
}
