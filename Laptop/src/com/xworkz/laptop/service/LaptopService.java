package com.xworkz.laptop.service;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDto;

public interface LaptopService {
	
    public boolean save(LaptopDto dto);
	
	public List<LaptopDto> readAll();
	
	public LaptopDto findById(int id);
	
	public LaptopDto findByName(String name);
	
	public boolean updateById(int id, String processor);
	
	public boolean updateByNameAndId(String name, int id, int price);
	
	public boolean deleteById(int id);

}
