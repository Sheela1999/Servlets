package com.xworkz.beautyparlor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.beautyparlor.dto.BeautyParlorDto;
import com.xworkz.beautyparlor.service.BeautyParlorService;
import com.xworkz.beautyparlor.service.BeautyParlorServiceImpl;

@WebServlet(urlPatterns = "/send")
public class BeautyParlorServlet extends HttpServlet {
	
	public BeautyParlorServlet() {
		System.out.println("This is Beauty Constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("Calling do post method....");
		
		BeautyParlorDto dto = new BeautyParlorDto();
		
		dto.setId( req.getParameter("id"));
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		dto.setGender(req.getParameter("gender"));
		dto.setPhoneNumber(req.getParameter("phoneNumber"));;
		dto.setEmail(req.getParameter("email"));
		dto.setCity(req.getParameter("city"));
		dto.setServiceCategory(req.getParameter("serviceCategory"));
		dto.setTreatments(req.getParameter("treatment"));
		dto.setMakeUpStyles(req.getParameter("makeup"));
		dto.setDate(req.getParameter("date"));
		dto.setTime(req.getParameter("time"));
		
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		
		//System.out.println("firstName");
		//System.out.println(dto);
		
		BeautyParlorService service = new BeautyParlorServiceImpl();
		
		boolean saved = service.save(dto);
		System.out.println(saved);
		
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println(dto);
		
		writer.println("<h1> Welcome" + " " + "<h2>" + firstName + " " + lastName);
		
	}

}
