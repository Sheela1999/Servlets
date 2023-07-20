package com.xworkz.vegetables.repo;

import java.util.List;

import com.xworkz.vegetables.dto.VegetablesDto;

public interface VegetablesRepo {
	
	public boolean save(VegetablesDto dto);
	
	public VegetablesDto findByName(String name);
	
	public VegetablesDto findTypeByName(String name, String type);
	
	public boolean updateNutrientsByName(String name, String nutrients);
	
	public boolean updatePriceAndColorByName(String name, int price, String color);
	
	public boolean deleteByPrice(int price);
	
	public List<VegetablesDto> readAll();

}
