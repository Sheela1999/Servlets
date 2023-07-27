package com.xworkz.foodstall.service;

import java.util.List;

import com.xworkz.foodstall.dto.FoodStallDto;

public interface FoodStallService {
	
	public boolean save(FoodStallDto dto);
	
	public FoodStallDto findById(int id);
	
	public FoodStallDto findByName(String name);
	
    public boolean updateNameById(int id, String name);
	
	public boolean updateCostAndLocationByName(String name, int cost, String location);
	
	public boolean deleteById(int id);
	
	public List<FoodStallDto> readAll();
	

}
