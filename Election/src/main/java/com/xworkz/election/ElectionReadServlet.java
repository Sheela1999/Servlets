package com.xworkz.election;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.election.dto.ElectionDto;
import com.xworkz.election.service.ElectionService;
import com.xworkz.election.service.ElectionServiceImpl;

@WebServlet(urlPatterns = "/read")
public class ElectionReadServlet extends HttpServlet {

	public ElectionReadServlet() {
		System.out.println("This Servlet Constructor...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("This is do get method....");

		ElectionService service = new ElectionServiceImpl();

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		List<ElectionDto> list = service.readAll();
		writer.print("Data Read Successfully");

		for (ElectionDto dto : list) {
			writer.print("<div>");
			writer.println(dto.getName());
			writer.println(dto.getPhoneNumber());
			writer.println(dto.getAge());
			writer.println(dto.getAddress());
			writer.println(dto.getPincode());
			writer.print("</div>");
		}

	}

}
