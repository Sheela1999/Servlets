package com.xworkz.teacherinfo.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.teacherinfo.dto.TeacherDto;
import com.xworkz.teacherinfo.repository.TeacherRepo;
import com.xworkz.teacherinfo.repository.TeacherRepoImpl;

public class TeacherServiceImpl implements TeacherService {

	TeacherRepo repo = new TeacherRepoImpl();

	@Override
	public boolean save(TeacherDto dto) {
		System.out.println("saved...");

		if (dto.getId() > 0 && dto.getSalary() >= 20000) {

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<TeacherDto>> violation = validator.validate(dto);

			if (violation.isEmpty()) {
				boolean save = repo.save(dto);
				System.out.println(save);
			} else {
				System.out.println("Error");
				System.out.println(violation);
			}
		} else {
			System.out.println(" id and salary is not valid");
		}
		return true;
	}

	@Override
	public List<TeacherDto> readAll() {
		return repo.readAll();
	}

	@Override
	public TeacherDto findById(int id) {
		if (id > 0) {
			return repo.findById(id);
		}
		System.out.println("id is not valid");
		return null;
	}

	@Override
	public TeacherDto findByName(String name) {
		if (name != null) {
			return repo.findByName(name);
		}
		System.out.println("name is not valid");
		return null;
	}

	@Override
	public boolean updateById(int id, int salary) {
		if (id > 0) {
			if (salary >= 20000) {

				ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
				Validator validator = factory.getValidator();
				Set<ConstraintViolation<Object>> violation = validator.validate(salary);

				if (violation.isEmpty()) {
					boolean update = repo.updateById(id, salary);
					System.out.println(update);
				} else {
					System.out.println("Error");
					System.out.println(violation);
				}
			} else {
				System.out.println("salary is not valid");
			}
		} else {
			System.out.println("id is not valid");
		}
		return true;
	}

	@Override
	public boolean updateByNameAndId(String name, int id, String subject) {
		if (name != null) {
			if (id > 0) {
				if (subject != null) {

					ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
					Validator validator = factory.getValidator();
					Set<ConstraintViolation<Object>> violation = validator.validate(subject);

					if (violation.isEmpty()) {
						boolean update = repo.updateByNameAndId(name, id, subject);
						System.out.println(update);
					} else {
						System.out.println("Error");
						System.out.println(violation);
					}
				} else {
					System.out.println("Subject is not valid");
				}
			} else {
				System.out.println("id is not valid");
			}
		} else {
			System.out.println("name is not valid");
		}
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		if(id > 0) {
			return repo.deleteById(id);
		}
		System.out.println("id is not valid");
		return false;
	}

}
