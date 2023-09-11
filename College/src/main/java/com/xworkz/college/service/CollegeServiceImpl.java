package com.xworkz.college.service;

import java.util.List;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.repo.CollegeRepo;
import com.xworkz.college.repo.CollegeRepoImpl;

public class CollegeServiceImpl implements CollegeService {

	CollegeRepoImpl repo = new CollegeRepoImpl();

	@Override
	public String save(CollegeDto dto) {
		System.out.println("dto is valid");
		System.out.println(dto);
		if (dto != null) {
			System.out.println("dto is not null");
			if(dto.getName() != null && dto.getName().length() > 3) {
				System.out.println(dto);
				System.out.println("name is valid");
				if(dto.getLocation() != null) {
					System.out.println("location is valid");
					if(dto.getNoOfStaffs()!=null && dto.getNoOfStudents()!=null) {
						// validate for all the fields
						System.out.println("save method from service");
						System.out.println(dto);
						return repo.save(dto);
					}
					System.out.println("num of staff and students are not valid");
					return null;
				}
				return "Location is not valid";
			}
			return "Name is not valid";
		}
		return "dto is null";
	}

	@Override
	public List<CollegeDto> readAll() {

		return repo.readAll();
	}

}
