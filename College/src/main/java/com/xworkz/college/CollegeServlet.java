package com.xworkz.college;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.service.CollegeServiceImpl;

@WebServlet(value = "/save")
public class CollegeServlet extends HttpServlet {

	private String name;
	private String location;
	private String noOfStudents;
	private String noOfStaffs;
	private CollegeDto dto;

	CollegeServiceImpl service = new CollegeServiceImpl();

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// dto.setId(1);
//		dto.setName("Alvas");
//		dto.setLocation("Moodbidre");
//		dto.setNoOfStudents("40000");
//		dto.setNoOfStaffs("5000");

//		 name=this.name;
//		 location=this.location;
//		 noOfStudents=this.noOfStudents;
//		 noOfStaffs=this.noOfStaffs;

		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();

		writer.print("<html>\r\n" + "    <head>\r\n" + "        <style>\r\n" + "            input {\r\n"
				+ "                padding: 10px;\r\n" + "                margin: 10px;\r\n" + "            }\r\n"
				+ "        </style>\r\n" + "        <title>Account</title>\r\n" + "    </head>\r\n" + "    <body>\r\n"
				+ "        <div style=\"text-align: center;\">\r\n"
				+ "        <h1>Create An Account for college</h1>\r\n"
				+ "        <form action=\"save\" method=\"post\" >\r\n"
				+ "            <div><input type=\"text\" name=\"name\" placeholder=\"Name\"></div>\r\n"
				+ "            <div><input type=\"text\" name=\"location\" placeholder=\"Location\"></div>\r\n"
				+ "            <div><input type=\"number\" name=\"noOfStudents\" placeholder=\"No of Students\"></div>\r\n"
				+ "           <div> <input type=\"number\" name=\"noOfStaffs\" placeholder=\"No of Staffs\"></div>\r\n"
				+ "            <div><button type=\"submit\">Create Account</button></div>\r\n" + "        </form>\r\n"
				+ "    </div>\r\n" + "    </body>\r\n" + "</html>");
	}

//		String name = req.getParameter("name");
//		String location = req.getParameter("location");
//		String noOfStudents = req.getParameter("noOfStudents");
//		String noOfStaffs = req.getParameter("noOfStaffs");

//		String rightName = getInitParameter("name");
//		String rightLocation = getInitParameter("location");
//		String rightNoOfStudents = getInitParameter("noOfStudents");
//		String rightNoOfStaffs = getInitParameter("noOfStaffs");
//		
//		if (!name.isEmpty() && !location.isEmpty() && !noOfStudents.isEmpty() && !noOfStaffs.isEmpty()) {
//			System.out.println("Inputs are valid");
//			if (name.equals(rightName) && location.equals(rightLocation)
//					&& noOfStudents.equals(rightNoOfStudents) && noOfStaffs.equals(rightNoOfStaffs)) {
//				System.out.println("Credentials are valid");
//				req.getRequestDispatcher("/read").forward(req, res);
//			} else {
//				req.getRequestDispatcher("/save").include(req, res);
//				writer.print("Data not valid");
//			}
//		}
//		
//	    CollegeDto dto = new CollegeDto(name, location, noOfStudents, noOfStaffs);
//
//		
//		 service.save(dto);

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String location = req.getParameter("location");
		String noOfStudents = req.getParameter("noOfStudents");
		String noOfStaffs = req.getParameter("noOfStaffs");

		System.out.println(name);
		System.out.println(location);
		System.out.println(noOfStudents);
		System.out.println(noOfStaffs);

		CollegeDto dto = new CollegeDto(name, location, noOfStudents, noOfStaffs);
		System.out.println(dto);
		String save = service.save(dto);
		System.out.println(save);

		if (save != null) {
			req.getRequestDispatcher("/Test.jsp").forward(req, res);
			// req.getRequestDispatcher("/save").include(req, res);
		} else {
			System.out.println("data is not correct");

		}
		return;

	}

}
