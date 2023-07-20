package com.xworkz.smartphone.service;

import java.util.List;

import com.xworkz.smartphone.dto.SmartPhoneDto;

public interface SmartPhoneService {
	
	public boolean save(SmartPhoneDto dto);
	
	public SmartPhoneDto findById(int id);
	
    public List<SmartPhoneDto> readAll();
    
    public boolean update(SmartPhoneDto dto);
	
	public boolean delete(SmartPhoneDto dto);
	
	public boolean deleteById(int id);
	
	public boolean updateByBrand(String brand, long model);
	
	public boolean deleteByType(String type);

}
