package com.xworkz.car.repository;

import java.util.List;

import com.xworkz.car.dto.CarDto;

public interface CarRepo {
	
	public boolean save(CarDto dto);
	
	public CarDto findById(int id);
	
	public CarDto FindByName(String name);
	
	public boolean updateNameById(int id, String name);
	
	public boolean updateColorAndEngineByName(String color, String engine, String name);
	
    public boolean deleteById(int id);
    
    public boolean deleteByPriceAndMileage(int price, String mileage);
	
	public List<CarDto> readAll();

}
