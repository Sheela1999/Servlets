package com.xworkz.airpods;

import java.util.List;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.service.AirpodsService;
import com.xworkz.airpods.service.AirpodsServiceImpl;

public class AirpodsTester {

	public static void main(String[] args) {
		
		AirpodsDto dto = new AirpodsDto(1, "Vivo", 2100, "Black", 12);
		
		AirpodsDto dto1 = new AirpodsDto(3, "OnePlus", 5000, "white", 15);
		

		AirpodsService service = new AirpodsServiceImpl();

//		service.store(dto);
//		service.store(dto1);

    	service.updateColorByName("Grey", "OnePlus");

//	service.deleteByPrice(2100);
		
		List<AirpodsDto> readData = service.readAll();
		for (AirpodsDto dtos : readData) {
			System.out.println(dtos);
		}

	}

}
