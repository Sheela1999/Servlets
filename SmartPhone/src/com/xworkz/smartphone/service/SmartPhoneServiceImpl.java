package com.xworkz.smartphone.service;

import java.util.List;

import com.xworkz.smartphone.dto.SmartPhoneDto;
import com.xworkz.smartphone.repo.SmartPhoneRepo;
import com.xworkz.smartphone.repo.SmartPhoneRepoImpl;

public class SmartPhoneServiceImpl implements SmartPhoneService {
	
	SmartPhoneRepo repo = new SmartPhoneRepoImpl();

	@Override
	public boolean save(SmartPhoneDto dto) {
		if(dto != null) {
			if(dto.getId()>0) {
				if(dto.getBrand() != null && dto.getBrand().length() > 3) {
					if(dto.getType() != null) {
						System.out.println("dto is valid");
						repo.save(dto);
						return true;
					}
					System.out.println("type is not valid");
					return false;
				}
				System.out.println("Brand is not valid");
				return false;
			}
			System.out.println("Id is not Valid");
			return false;
		}
		System.out.println("Dto is null");
		return false;
	}

	@Override
	public SmartPhoneDto findById(int id) {
		if(id>0) {
			System.out.println("id is validated");
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public List<SmartPhoneDto> readAll() {
		List<SmartPhoneDto> read = repo.readAll();
		return read;
	}
	
	@Override
	public boolean update(SmartPhoneDto dto) {
	    if(dto != null) {
	    	System.out.println("updated");
	    	repo.update(dto);
	    	return true;
	    }
		return false;
	}

	@Override
	public boolean delete(SmartPhoneDto dto) {
		if(dto != null) {
			System.out.println("deleted");
			repo.delete(dto);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean deleteById(int id) {
		if(id>0) {
			System.out.println("deleted by Id");
			repo.deleteById(id);
			return true; 
		}
		return false;
	}

	@Override
	public boolean updateByBrand(String brand, long model) {
		if(brand != null && model > 1010l) {
			boolean updated = repo.updateByBrand(brand, model);
			return updated;
		}
		return false;
	}

	@Override
	public boolean deleteByType(String type) {
		if(type!=null) {
		repo.deleteByType(type);
		return true;
		}
		return false;
	}
}
