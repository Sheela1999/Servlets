package com.xworkz.tablet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.tablet.dto.TabletDto;
import com.xworkz.tablet.service.TabletService;
import com.xworkz.tablet.service.TabletServiceImpl;

@WebServlet(urlPatterns = "/sending")
public class TabletServlet extends HttpServlet {
	
	public TabletServlet() {
		System.out.println("this is tablet constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("Calling do post method....");
		
		TabletDto dto = new TabletDto();
		
		dto.setId( req.getParameter("id"));
		dto.setTabletName(req.getParameter("tabletName"));
		dto.setDosage(req.getParameter("dosage"));
		dto.setManufacturingDate(req.getParameter("date"));
		dto.setTabletType(req.getParameter("type"));
		dto.setCompanyName(req.getParameter("companyName"));
		dto.setExpiringDate(req.getParameter("expiringDate"));
		System.out.println(dto);
		
//		String id = req.getParameter("id");
//		String name = req.getParameter("tabletName");
//		String dosage = req.getParameter("dosage");
//		String date = req.getParameter("date");
//		String type = req.getParameter("type");
//		String companyName = req.getParameter("companyName");
//		String expDate = req.getParameter("expiringDate");
//		
//		dto.setId(id);
//		dto.setTabletName(name);
//		dto.setDosage(dosage);
//		dto.setManufacturingDate(date);
//		dto.setTabletType(type);
//		dto.setCompanyName(companyName);
//		dto.setExpiringDate(expDate);
		
		TabletService service = new TabletServiceImpl();
		
		resp.setContentType( "text/HTML");
		PrintWriter writer= resp.getWriter();
		
		service.save(dto);
		
//		ResultSet set = service.find(companyName, id);
//		writer.println(set);
		
		writer.println("<h1><center>information</center></h1>");
		writer.println("<h1>welcome to Apollo"+" "+"!!<h1><br>");
		
		
	}
	
	

}
