package com.xworkz.car.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.car.dto.CarDto;
import com.xworkz.car.repository.CarRepo;
import com.xworkz.car.repository.CarRepoImpl;

public class CarServiceImpl implements CarService {
	
	CarRepo repo = new CarRepoImpl();

	@Override
	public boolean save(CarDto dto) {
		System.out.println("saved...");
		
		if ( dto.getId()>0 && dto.getPrice() >= 300000) {

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<CarDto>> violation = validator.validate(dto);

			if (violation.isEmpty()) {
				boolean save = repo.save(dto);
				System.out.println(save);
			} else {
				System.out.println("Error");
				System.out.println(violation);
			}
		} else {
			System.out.println("Price is not valid");
		}
		return true;
	}

	@Override
	public CarDto findById(int id) {
		if(id >=0 ) {
			return repo.findById(id);	
		}
		return null;
	}
	
	@Override
	public CarDto FindByName(String name) {
		if(name != null) {
			return repo.FindByName(name);
		}
		return null;
	}

	@Override
	public boolean updateNameById(int id, String name) {
		System.out.println("Updated...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<String>> violation = validator.validate(name, CarDto.class);

		if (violation.isEmpty()) {
			boolean update = repo.updateNameById(id, name);
			System.out.println(update);
		} else {
			System.out.println("Error");
			System.out.println(violation);
		}

		return true;
	}
	
	@Override
	public boolean updateColorAndEngineByName(String color, String engine, String name) {
		System.out.println("Updated 2 fields by name...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<String>> violation = validator.validate(name, CarDto.class);

		if (violation.isEmpty()) {
			boolean update = repo.updateColorAndEngineByName(color, engine, name);
			System.out.println(update);
		} else {
			System.out.println("Error");
			System.out.println(violation);
		}
		return true;
	}


	@Override
	public boolean deleteById(int id) {
		if(id >=0) {
			return repo.deleteById(id);
		}
		System.out.println("id is not valid");
		return false;
	}
	
	@Override
	public boolean deleteByPriceAndMileage(int price, String mileage) {
		if(price>300000) {
			if(mileage != null) {
				repo.deleteByPriceAndMileage(price, mileage);
				return true;
			}
			System.out.println("Mileage is not valid");
			return false;
		}
		System.out.println("Price is not valid");
		return false;
	}

	@Override
	public List<CarDto> readAll() {
		return repo.readAll();
	}

	

	
}
