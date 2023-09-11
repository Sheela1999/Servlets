package com.xworkz.college.repo;

import java.util.List;

import com.xworkz.college.dto.CollegeDto;

public interface CollegeRepo {

	String save(CollegeDto dto);

	List<CollegeDto> readAll();

}
