package com.xworkz.beautyparlor.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.beautyparlor.dto.BeautyParlorDto;
import com.xworkz.beautyparlor.repository.BeautyParlorRepository;
import com.xworkz.beautyparlor.repository.BeautyParlorRepositoryImpl;

public class BeautyParlorServiceImpl implements BeautyParlorService {

	BeautyParlorRepository repo = new BeautyParlorRepositoryImpl();

	@Override
	public boolean save(BeautyParlorDto dto) {
		System.out.println("saved...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BeautyParlorDto>> violation = validator.validate(dto);

		if (violation.isEmpty()) {
			boolean save = repo.save(dto);
			System.out.println(save);
		} else {
			System.out.println("Error");
			System.out.println(violation);
		}
		return false;
	}

	@Override
	public boolean find(String name) {
		
		return false;
	}

}
