package com.xworkz.beautyparlor.repository;

import com.xworkz.beautyparlor.dto.BeautyParlorDto;

public interface BeautyParlorRepository {
	
	public boolean save(BeautyParlorDto dto);
	
	public boolean find(String name);

}
