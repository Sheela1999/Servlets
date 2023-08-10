package com.xworkz.airpods.service;

import java.util.List;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.repo.AirpodRepoImpl;
import com.xworkz.airpods.repo.AirpodsRepo;

public class AirpodsServiceImpl implements AirpodsService {

	AirpodsRepo repo = new AirpodRepoImpl();

	public boolean store(AirpodsDto dto) {

		if (dto != null) {
			if (dto.getId() > 0 && dto.getPrice() > 2000) {
			   boolean saved = repo.store(dto);
			   System.out.println(saved);
			   System.out.println("saved..");
			   return true;
			}
		}
		System.out.println("dto is null");
		return false;
	}

	public boolean updateColorByName(String color, String name) {

		if (color != null && name != null) {
			System.out.println("data for updation is valid");
			return repo.updateColorByName(color, name);
		}
		System.out.println("data is null");
		return false;
	}

	public boolean deleteByPrice(int price) {
		if (price > 2000 && price < 10000) {
			System.out.println("price valid");
			return repo.deleteByPrice(price);
		}
		System.out.println("data not valid");
		return false;
	}

	public List<AirpodsDto> readAll() {
		return repo.readAll();
	}

}
