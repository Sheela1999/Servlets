package com.xworkz.election;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.election.dto.ElectionDto;
import com.xworkz.election.service.ElectionService;
import com.xworkz.election.service.ElectionServiceImpl;

@WebServlet(urlPatterns = "/save")
public class ElectionServlet extends HttpServlet {

	public ElectionServlet() {
		System.out.println("this is ElectionServlet Constructor...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String phoneNumber = req.getParameter("phoneNumber");
		String age = req.getParameter("age");
		String address = req.getParameter("address");
		String pincode = req.getParameter("pincode");

		ElectionDto dto = new ElectionDto(id, name, phoneNumber, age, address, pincode);

		ElectionService service = new ElectionServiceImpl();

		boolean status = service.save(dto);

		if (status == true) {
			req.getRequestDispatcher("/Read.jsp").forward(req, resp);
			System.out.println("data saved Successfully");
		} else {
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			req.getRequestDispatcher("/ElectionForm.jsp").include(req, resp);
			writer.print("<h3>Data not valid so not saved</h3>");
		}

	}

//		dto.setId(request.getParameter("id"));
//		dto.setName(request.getParameter("name"));
//		dto.setPhoneNumber(request.getParameter("phoneNumber"));
//		dto.setAge(request.getParameter("age"));
//		dto.setAddress(request.getParameter("address"));
//		dto.setPincode(request.getParameter("pincode"));

	// System.out.println(name + " " + phoneNumber + " " + age + " " + address + " "
	// + pincode);

//		dto.setId(id);
//		dto.setName(name);
//		dto.setPhoneNumber(phoneNumber);
//		dto.setAge(age);
//		dto.setAddress(address);
//		dto.setPincode(pincode);

}
