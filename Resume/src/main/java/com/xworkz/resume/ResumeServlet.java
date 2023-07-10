package com.xworkz.resume;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class ResumeServlet extends HttpServlet {
	
	public ResumeServlet() {
		System.out.println("This is resume servlet...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	    System.out.println("This is do get method");
	    
	    String firstname = req.getParameter("firstName");
	    String lastname = req.getParameter("lastName");
	    String email = req.getParameter("email");
	    String contactnumber = req.getParameter("contactNumber");
	    String linkedIn = req.getParameter("linkedInLink");
	    String gitHub = req.getParameter("gitHubLink");
	    String qualification = req.getParameter("Qualification");
	    String skills = req.getParameter("skills");
	    String areaOfInterest = req.getParameter("Area of Interest");
	    String courseName = req.getParameter("courseName");
	    String projectName = req.getParameter("projectName");
	    String jobrole = req.getParameter("jobRole");
	    
//	    System.out.println(firstname + "   " + lastname + "   " + email + "   " + contactnumber + "   " + linkedIn + "   " +
//	    		gitHub + "   " +  qualification + "   " +  skills + "   " +  areaOfInterest + "   " +  courseName + "   " +
//	    		projectName + "   " + jobrole);
	    
	    
	    System.out.println(firstname);
	    System.out.println(lastname);
	    System.out.println(email);
	    System.out.println(contactnumber);
	    System.out.println(linkedIn);
	    System.out.println(gitHub);
	    System.out.println(qualification);
	    System.out.println(skills);
	    System.out.println(areaOfInterest);
	    System.out.println(courseName);
	    System.out.println(projectName);
	    System.out.println(jobrole);
	    
	    resp.setContentType("text/HTML");
	    PrintWriter writer = resp.getWriter();
//	    writer.println("FirstName      " + firstname);
//	    writer.println("LastName       " + lastname);
//	    writer.println("Email          " + email);
//	    writer.println("Job Role       " + jobrole);
//	    writer.println("Project Name   " + projectName);
	    
	    writer.println("<h2>"+""+ firstname + " " +"<h2>"+ lastname +" " +"<h2>"+ email + " " +"<h2>"+ jobrole + " " +"<h2>"+ projectName);
//	    writer.println("<h1><button>Back</button></h1>");
	    
	    writer.println("<h1><form>\r\n"
                       + " <input type=\"button\" value=\"Go back!\" onclick=\"history.back()\">\r\n"
	    		       + "</form>");
	}

}
