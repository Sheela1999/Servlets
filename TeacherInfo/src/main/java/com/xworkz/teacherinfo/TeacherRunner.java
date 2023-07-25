package com.xworkz.teacherinfo;

import java.util.List;

import com.xworkz.teacherinfo.dto.TeacherDto;
import com.xworkz.teacherinfo.service.TeacherService;
import com.xworkz.teacherinfo.service.TeacherServiceImpl;

public class TeacherRunner {

	public static void main(String[] args) {

		TeacherDto dto = new TeacherDto(1, "Pallavi", 35000, "MSc Maths", "Mathematics", "Shivmoga");

		TeacherDto dto1 = new TeacherDto(2, "Aishu", 40000, "BEd", "History", "Jamkhandi");

		TeacherDto dto2 = new TeacherDto(3, "Nikitha", 45000, "BSc", "Zoology", "Mysore");

		TeacherDto dto3 = new TeacherDto(4, "Rohini", 85000, "MTech", "Network Analysis", "Moodbidre");

		TeacherDto dto4 = new TeacherDto(5, "Sheela", 25000, "TCH", "Science", "Belagavi");

		TeacherService service = new TeacherServiceImpl();

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);

		TeacherDto FoundData = service.findById(2);
		System.out.println(FoundData);

		System.out.println(
				"----------------------------------findByName-----------------------------------------------------");
		TeacherDto found = service.findByName("'Nikitha'");
		System.out.println(found);

		System.out.println(
				"------------------------------------UpdateById---------------------------------------------------");
		service.updateById(5, 32000);

		System.out.println(
				"--------------------------------------------UpdateByNameAndId-----------------------------------");
		boolean data = service.updateByNameAndId("'Rohini'", 4, "Microcontroller");
		System.out.println(data);

		System.out.println(
				"_________________________________deleteById__________________________________________________");
//		boolean dlt = service.deleteById(2);
//		System.out.println(dlt);

		System.out.println(
				"----------------------------------------ReadAll--------------------------------------------------");

		List<TeacherDto> readData = service.readAll();
		for (TeacherDto dtos : readData) {
			System.out.println(dtos);
		}

	}

}
