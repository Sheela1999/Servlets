package com.xworkz.foodstall.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.foodstall.dto.FoodStallDto;
import com.xworkz.foodstall.repository.FoodStallRepo;
import com.xworkz.foodstall.repository.FoodStallRepoImpl;

public class FoodStallServiceImpl implements FoodStallService {
	
	FoodStallRepo repo = new FoodStallRepoImpl();

	@Override
	public boolean save(FoodStallDto dto) {
		if(dto.getId() > 0) {
			if(dto.getCost() >= 15) {
				if(dto.getNoOfFoodVarieties() > 5) {
					System.out.println("data is validated");
					ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
					Validator validator = factory.getValidator();
					Set<ConstraintViolation<FoodStallDto>> violation = validator.validate(dto);

					if (violation.isEmpty()) {
						boolean save = repo.save(dto);
						System.out.println(save);
					} else {
						System.out.println("Error");
						System.out.println(violation);
					}
				}else {
					System.out.println("no of food varieties are not valid");
				}
			}else {
				System.out.println("cost is not valid");
			}
		}else {
			System.out.println("id is not valid");
		}
		return false;
	}
	
	@Override
	public FoodStallDto findById(int id) {
		if(id > 0) {
			return repo.findById(id);
		}
		System.out.println("id is not valid");
		return null;
	}

	@Override
	public FoodStallDto findByName(String name) {
		if(name != null) {
			return repo.findByName(name);
		}
		System.out.println("name is not valid");
		return null;
	}

	@Override
	public boolean updateNameById(int id, String name) {
		if(id>0) {
			if(name != null) {
				return repo.updateNameById(id, name);
			}
			System.out.println("name is not valid");
			return false;
		}
		System.out.println("id is not valid");
		return false;
	}

	@Override
	public boolean updateCostAndLocationByName(String name, int cost, String location) {
		if(name != null) {
			if(cost >= 15) {
				if(location != null) {
					return repo.updateCostAndLocationByName(name, cost, location);
				}
				System.out.println("location is not valid");
				return false;
			}
			System.out.println("cost is not valid");
			return false;
		}
		System.out.println("name is not valid");
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(id > 0) {
			return repo.deleteById(id);
		}
		System.out.println("id is not valid");
		return false;
	}

	@Override
	public List<FoodStallDto> readAll() {
		return repo.readAll();
	}

	

}
