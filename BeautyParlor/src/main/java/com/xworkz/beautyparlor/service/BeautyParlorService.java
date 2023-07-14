package com.xworkz.beautyparlor.service;

import com.xworkz.beautyparlor.dto.BeautyParlorDto;

public interface BeautyParlorService {
	
	public boolean save(BeautyParlorDto dto);
	
	public boolean find(String name);

}
