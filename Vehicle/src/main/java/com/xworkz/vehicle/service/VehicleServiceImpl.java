package com.xworkz.vehicle.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.repository.VehicleRepo;
import com.xworkz.vehicle.repository.VehicleRepoImpl;

public class VehicleServiceImpl implements VehicleService {

	VehicleRepo repo = new VehicleRepoImpl();

	@Override
	public boolean save(VehicleDto dto) {
		if (dto.getId() > 0) {
			if (dto.getPower() > 30) {
				ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
				Validator validator = factory.getValidator();
				Set<ConstraintViolation<VehicleDto>> voilation = validator.validate(dto);

				if (voilation.isEmpty()) {
					boolean saved = repo.save(dto);
					System.out.println(saved);
				} else {
					System.out.println("Error");
					System.out.println(voilation);
				}
			} else {
				System.out.println("power is not valid");
			}
		} else {
			System.out.println("id is not valid");
		}
		return true;
	}

	@Override
	public VehicleDto findByName(String name) {
		if (name != null) {
			return repo.findByName(name);
		}
		System.out.println("name is not found");
		return null;
	}

	@Override
	public VehicleDto FindByConsumesAndPower(String consumes, int power) {
		if (consumes != null) {
			if (power > 20) {
				return repo.FindByConsumesAndPower(consumes, power);
			}
			System.out.println("power is not valid");
			return null;
		}
		System.out.println("consuming is not valid");
		return null;
	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		if (type != null) {
			if (name != null) {
				return repo.updateTypeByName(type, name);
			}
			System.out.println("name is not valid");
			return false;
		}
		System.out.println("type is not valid");
		return false;
	}

	@Override
	public boolean updateLaunchedInAndPowerById(int id, String launchedIn, int power) {
		if (id > 0) {
			if (launchedIn != null) {
				if (power > 20) {
					return repo.updateLaunchedInAndPowerById(id, launchedIn, power);
				}
				System.out.println("power is not valid");
				return false;
			}
			System.out.println("launched date is not valid");
			return false;
		}
		System.out.println("id is not valid");
		return false;
	}

	@Override
	public boolean deleteByLaunchedIn(String launchedIn) {
		if (launchedIn != null) {
			repo.deleteByLaunchedIn(launchedIn);
			return true;
		}
		System.out.println("launched date is not valid");
		return false;
	}

	@Override
	public List<VehicleDto> readAll() {
		return repo.readAll();
	}

}
