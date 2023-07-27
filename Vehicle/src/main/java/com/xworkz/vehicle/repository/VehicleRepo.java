package com.xworkz.vehicle.repository;

import java.util.List;

import com.xworkz.vehicle.dto.VehicleDto;

public interface VehicleRepo {
	
	public boolean save(VehicleDto dto);
	
    public VehicleDto findByName(String name);
	
	public VehicleDto FindByConsumesAndPower(String consumes, int power);
	
	public boolean updateTypeByName(String type, String name);
	
    public boolean updateLaunchedInAndPowerById(int id, String launchedIn, int power);
	
	public boolean deleteByLaunchedIn(String launchedIn);
	
	public List<VehicleDto> readAll();

}
