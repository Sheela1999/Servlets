package com.xworkz.foodstall;

import java.util.List;

import com.xworkz.foodstall.dto.FoodStallDto;
import com.xworkz.foodstall.service.FoodStallService;
import com.xworkz.foodstall.service.FoodStallServiceImpl;

public class FoodstallRunner {

	public static void main(String[] args) {
		
		FoodStallDto dto = new FoodStallDto(1, "ChutChat", "Gobi", 60, "BTM", 15, "flavorsome");
		
		FoodStallDto dto1 = new FoodStallDto(2, "99Tasty", "Masala Bujji", 15, "Rajajinagara", 10, "salty");
		
		FoodStallDto dto2 = new FoodStallDto(3, "GupChuup", "PaaniPoori", 25, "JPNagara", 20, "flat");
		
		FoodStallDto dto3 = new FoodStallDto(4, "BiteFul", "Pav bhaji", 80, "Bommanalli", 30, "Yummy");
		
		FoodStallDto dto4 = new FoodStallDto(5, "FoodFest", "Save Poori", 60, "Belagavi", 12, "Delicious");
		
		FoodStallService service = new FoodStallServiceImpl();
		
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
		
		FoodStallDto foundDtos = service.findById(1);
		System.out.println(foundDtos);
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		FoodStallDto foundData = service.findByName("Save Poori");
		System.out.println(foundData);
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		boolean updated = service.updateNameById(2, "TastyChats");
		System.out.println(updated);
		
		System.out.println("_______________________________________updateBy2fields_________________________________");
		
		boolean updatedData = service.updateCostAndLocationByName("Pav bhaji", 90, "Mysore");
		System.out.println(updatedData);
		
		System.out.println("--------------------------------deleteByid-------------------------------------------");
		
		//service.deleteById(3);
		
		System.out.println("_____________________________readAll___________________________________________________");
		
		List<FoodStallDto> readData = service.readAll();
		for (FoodStallDto dtos : readData) {
			System.out.println(dtos);
		}

	}

}
