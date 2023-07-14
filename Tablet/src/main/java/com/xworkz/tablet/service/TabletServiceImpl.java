package com.xworkz.tablet.service;

import java.sql.ResultSet;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.tablet.dto.TabletDto;
import com.xworkz.tablet.repository.TabletRepo;
import com.xworkz.tablet.repository.TabletRepoImpl;

public class TabletServiceImpl implements TabletService {
	
	TabletRepo repo = new TabletRepoImpl();

	@Override
	public boolean save(TabletDto dto) {
		System.out.println("saved...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TabletDto>> violation = validator.validate(dto);

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
	public ResultSet find(TabletDto dto, String companyName) {
	    ResultSet found = repo.find(dto, companyName);
	    System.out.println(found);
		return null;
	}

}
