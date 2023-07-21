package com.xworkz.vegetables;

import java.util.List;

import com.xworkz.vegetables.dto.VegetablesDto;
import com.xworkz.vegetables.service.VegetablesService;
import com.xworkz.vegetables.service.VegetablesServiceImpl;

public class VegetablesEater {

	public static void main(String[] args) {
		
		VegetablesDto dto = new VegetablesDto(1, "Carrot", 42, "Vitamin A", "ROOT", "Orange");
		
		VegetablesDto dto1 = new VegetablesDto(2, "Lettuce", 88, "Vitamin C", "LEAFY GREEN", "light green to reddish brown");
		
		VegetablesDto dto2 = new VegetablesDto(3, "Cucumber", 32, "Phytonutrients and Vitamin K", "MARROW", "Green and Orange");
		
		VegetablesDto dto3 = new VegetablesDto(4, "Cabbage", 25, "Vitamin E", "CRUCIFEROUS", "Pale green");
		
		VegetablesService service = new VegetablesServiceImpl();
		
		//service.save(dto);
		//service.save(dto1);
		//service.save(dto2);
		//service.save(dto3);
		
//		VegetablesDto found = service.findByName("'Cabbage'");
//		System.out.println(found);
		
//		VegetablesDto foundData = service.findTypeByName("'Carrot'", "'MARROW'");
//		System.out.println(foundData);
		
//		boolean updated = service.updateNutrientsByName("'Cabbage'", "Vitamin K");
//		System.out.println(updated);
		
		boolean updatedDto = service.updatePriceAndColorByName("'Lettuce'", 60, "Oak");
		System.out.println(updatedDto);
		
		System.out.println("-----------------------------------------------------------");
		
//		service.deleteByPrice(25);
		
		List<VegetablesDto> readData = service.readAll();
		readData.forEach((l) -> {System.out.println(l);});
		
	}

}
