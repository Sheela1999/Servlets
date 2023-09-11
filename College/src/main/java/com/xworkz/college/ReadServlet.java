package com.xworkz.college;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImpl;


@WebServlet(value = "/read")
public class ReadServlet extends HttpServlet{
	
	CollegeService service = new CollegeServiceImpl();
	
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
		System.out.println("This is readServlet");
		
		response.setContentType("text/html");
		List<CollegeDto> data = service.readAll();
		PrintWriter writer = response.getWriter();
		
		writer.print("<table>");
		for(CollegeDto dto : data){
			
			writer.print("<div>");
			writer.print("<tr>");
			writer.print(dto.getName());
			writer.print("</tr>");
			writer.print("<tr>");
			writer.print(dto.getLocation());
			writer.print("</tr>");	
			writer.print("<tr>");
			writer.print(dto.getNoOfStaffs());
			writer.print("</tr>");
			writer.print("<tr>");
			writer.print(dto.getNoOfStudents());
			writer.print("</tr>");
			writer.print("<tr>");
			writer.print("</div>");
	}
		writer.print("</table>");
	
	}
}
