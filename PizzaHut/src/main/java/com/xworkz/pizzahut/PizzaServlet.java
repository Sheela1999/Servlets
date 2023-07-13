package com.xworkz.pizzahut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.xworkz.pizzahut.dto.PizzaHutDto;
import com.xworkz.pizzahut.service.PizzaHutService;
import com.xworkz.pizzahut.service.PizzaHutServiceImpl;

@WebServlet(urlPatterns = "/send")
public class PizzaServlet extends HttpServlet {

	public PizzaServlet() {
		System.out.println("This is Pizza Servlet constructor..........");
	}

	@Override
	public void doPost(HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws IOException {

		System.out.println("This is Do post method...");

		PizzaHutDto dto = new PizzaHutDto();

		dto.setPizzaName(req.getParameter("pizzaName"));
		dto.setPizzaType(req.getParameter("type"));
		dto.setSize(req.getParameter("size"));
		dto.setLocation(req.getParameter("location"));
		dto.setPaymentMode(req.getParameter("payment"));
		//System.out.println(dto);

		PizzaHutService service = new PizzaHutServiceImpl();

		boolean saved = service.save(dto);
		System.out.println(saved);

		resp.setContentType("Text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println(dto);
	}

}
