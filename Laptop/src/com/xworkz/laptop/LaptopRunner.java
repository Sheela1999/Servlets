package com.xworkz.laptop;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.service.LaptopService;
import com.xworkz.laptop.service.LaptopServiceImpl;

public class LaptopRunner {

	public static void main(String[] args) {
		
		LaptopDto dto = new LaptopDto(1, "Hp", 32000, "512 GB", "2.0 Ghz", "Core i3");
		
		LaptopDto dto1 = new LaptopDto(2, "Lenovo", 39000, "256 GB", "2.3 Ghz", "Core i5");
		
		LaptopDto dto2 = new LaptopDto(3, "Dell", 42000, "1 TB", "4 Ghz", "Core i6");
		
		LaptopDto dto3 = new LaptopDto(4, "Asus", 52000, "256 GB", "2.4 Ghz", "Core i7");
		
		LaptopService service = new LaptopServiceImpl();
		
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
		
		LaptopDto found = service.findById(1);
		System.out.println(found);
		
		System.out.println("------------------------------FindByName------------------------------------------");
		
		LaptopDto foundData = service.findByName("'Dell'");
		System.out.println(foundData);
		
		System.out.println("----------------------updateByid--------------------------------------------------");
		service.updateById(1, "4.4 Ghz");
		
		System.out.println("----------------------updateByNameAndId-----------------------------------------------");
		boolean updatedData = service.updateByNameAndId("'Asus'", 4, 49000);
		System.out.println(updatedData);
		
		System.out.println("----------------------deleteById-------------------------------------------------------");
		//service.deleteById(2);
		
		System.out.println("------------------------------readAll-----------------------------------------------");
		
		List<LaptopDto> laptopData = service.readAll();
		for (LaptopDto dtos : laptopData) {
			System.out.println(dtos);
		}

	}

}
