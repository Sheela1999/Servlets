package com.xworkz.college.service;

import java.util.List;

import com.xworkz.college.dto.CollegeDto;

public interface CollegeService {

	public String save(CollegeDto dto);

	public List<CollegeDto> readAll();

}
