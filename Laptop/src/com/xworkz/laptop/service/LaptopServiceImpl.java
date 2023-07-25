package com.xworkz.laptop.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.repository.LaptopRepo;
import com.xworkz.laptop.repository.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService {

	LaptopRepo repo = new LaptopRepoImpl();

	@Override
	public boolean save(LaptopDto dto) {
		System.out.println("saved...");
		if (dto.getPrice() >= 15000) {
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<LaptopDto>> violation = validator.validate(dto);

			if (violation.isEmpty()) {
				boolean save = repo.save(dto);
				System.out.println(save);
			} else {
				System.out.println("Error");
				System.out.println(violation);
			}
		} else {
			System.out.println("price is not valid");
		}
		return true;
	}

	@Override
	public List<LaptopDto> readAll() {
		return repo.readAll();
	}

	@Override
	public LaptopDto findById(int id) {
		if (id > 0) {
			return repo.findById(id);
		}
		System.out.println("id is not valid");
		return null;
	}

	@Override
	public LaptopDto findByName(String name) {
		if (name != null) {
			return repo.findByName(name);
		}
		System.out.println("name not valid");
		return null;
	}

	@Override
	public boolean updateById(int id, String processor) {
		if (id > 0) {
			if (processor != null) {
				ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
				Validator validator = factory.getValidator();
				Set<ConstraintViolation<Object>> violation = validator.validate(processor);

				if (violation.isEmpty()) {
					boolean save = repo.updateById(id, processor);
					System.out.println(save);
				} else {
					System.out.println("Error");
					System.out.println(violation);
				}
			} else {
				System.out.println("processor not valid");
			}
		} else {
			System.out.println("id is not valid");
		}
		return true;
	}

	@Override
	public boolean updateByNameAndId(String name, int id, int price) {
		if (name != null) {
			if (id > 0) {
				if (price > 15000) {
					ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
					Validator validator = factory.getValidator();
					Set<ConstraintViolation<Object>> violation = validator.validate(price);

					if (violation.isEmpty()) {
						boolean save = repo.updateByNameAndId(name, id, price);
						System.out.println(save);
					} else {
						System.out.println("Error");
						System.out.println(violation);
					}
				} else {
					System.out.println("price not valid");
				}
			} else {
				System.out.println("id not valid");
			}
		} else {
			System.out.println("name not valid");
		}
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		if (id > 0) {
			return repo.deleteById(id);
		}
		return false;
	}

}
