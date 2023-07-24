package com.xworkz.car;

import java.util.List;

import com.xworkz.car.constants.FuelType;
import com.xworkz.car.dto.CarDto;
import com.xworkz.car.service.CarService;
import com.xworkz.car.service.CarServiceImpl;

public class CarRunner {

	public static void main(String[] args) {
		
		CarService service = new CarServiceImpl();
		
		CarDto dto = new CarDto(1, "Honda New City", 1157000, "18.5 km/l", "1498 cc", FuelType.PETROL, "White", "10 years", true, "89 rpm", "Air Bag");
		
		CarDto dto1 = new CarDto(2, "Kia Sonet", 1489000, "11.6 km/l", "1099 cc", FuelType.LPG, "Grey", "8 years", false, "80 rpm", "Dual Front AirBag");
		
		CarDto dto2 = new CarDto(3, "Maruthi Alto", 405000, "18.6 km/l", "1199 cc", FuelType.DIESEL, "Black", "5 years", false, "79 rpm", "i-srs");
		
		CarDto dto3 = new CarDto(4, "Audi A4", 518500, "20.6 km/l", "1984 cc", FuelType.PETROL, "Tango Red", "12 years", true, "202 bhp", "i-side AirBags");
		
		//service.save(dto);
		//service.save(dto1);
		//service.save(dto2);
		//service.save(dto3);
		
		CarDto FoundDto = service.findById(4);
		System.out.println(FoundDto);
		
		System.out.println("------------------------------findByName----------------------------------------------------------------------------");
		
		CarDto found = service.FindByName("'Honda New City'");
		System.out.println(found);
		
		System.out.println("_______________________________UpdateNameByID_____________________________________________");
		
		boolean updatedData = service.updateNameById(3, "Maruthi Alto 800");
		System.out.println(updatedData);
		
		System.out.println("------------------------update2Fields---------------------------------------------------------------------------------");
		service.updateColorAndEngineByName("Ibis white", "25.6 Km/l", "'Audi A4'");
		
		System.out.println("--------------------------------DeleteById-----------------------------------------------");
		
//		boolean deleted = service.deleteById(2);
//		System.out.println(deleted);
		
		System.out.println("---------------------------------------deleteBy2fields-----------------------------------------------------------------");
		
//		service.deleteByPriceAndMileage(1489000, "'11.6 km/l'");
		
		System.out.println("___________________________________readAll___________________________________________________");
		
		List<CarDto> read = service.readAll();
//		System.out.println(read);
		
	}

}
