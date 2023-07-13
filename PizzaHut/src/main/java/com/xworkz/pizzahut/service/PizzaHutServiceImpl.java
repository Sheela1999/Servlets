package com.xworkz.pizzahut.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.pizzahut.dto.PizzaHutDto;
import com.xworkz.pizzahut.repository.PizzaHutRepository;
import com.xworkz.pizzahut.repository.PizzaHutRepositoryImpl;

public class PizzaHutServiceImpl implements PizzaHutService {

	PizzaHutRepository repo = new PizzaHutRepositoryImpl();

	@Override
	public boolean save(PizzaHutDto dto) {
		System.out.println("saved...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<PizzaHutDto>> violation = validator.validate(dto);

		if (violation.isEmpty()) {
			boolean save = repo.save(dto);
			System.out.println(save);
		} else {
			System.out.println("Error");
			System.out.println(violation);
		}
		return false;
	}

}
