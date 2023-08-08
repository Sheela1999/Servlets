package com.xworkz.election.service;

import java.util.List;

import com.xworkz.election.dto.ElectionDto;
import com.xworkz.election.repo.ElectionRepo;
import com.xworkz.election.repo.ElectionRepoImpl;

public class ElectionServiceImpl implements ElectionService {

	ElectionRepoImpl repo = new ElectionRepoImpl();

	@Override
	public boolean save(ElectionDto dto) {
		System.out.println("data validated...");
		if (dto != null) {
				if (dto.getName() != null) {

					if (dto.getPincode().length() > 3) {
						repo.save(dto);
						System.out.println("data saved");
						return true;
					}
					System.out.println("pincode not valid");
					return false;
				}
				System.out.println("name not valid");
				return false;
			}
			System.out.println("dto is null");
			return false;
	}

	@Override
	public List<ElectionDto> readAll() {

		return repo.readAll();
	}

}
