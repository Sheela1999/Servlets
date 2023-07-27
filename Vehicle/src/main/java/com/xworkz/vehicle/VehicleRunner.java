package com.xworkz.vehicle;

import java.util.List;

import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.service.VehicleService;
import com.xworkz.vehicle.service.VehicleServiceImpl;

public class VehicleRunner {

	public static void main(String[] args) {

		VehicleDto dto = new VehicleDto(1, "Yamaha", "MotorCycle", "Petrol", 50, "23-09-2022");

		VehicleDto dto1 = new VehicleDto(2, "Honda City", "Car", "Petrol and Diesel", 90, "10-01-2023");

		VehicleDto dto2 = new VehicleDto(3, "Bajaj", "Bike", "Diesel", 60, "15-07-2012");

		VehicleDto dto3 = new VehicleDto(4, "Audi", "MotorCycle", "Petrol", 100, "01-05-2010");

		VehicleService service = new VehicleServiceImpl();

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);

		VehicleDto FoundDto = service.findByName("Audi");
		System.out.println(FoundDto);

		System.out.println("--------------------------FindByConsumesAndPower----------------------------------");
		VehicleDto FoundData = service.FindByConsumesAndPower("Petrol", 50);
		System.out.println(FoundData);

		System.out.println("___________________UPdateTypeByNAme___________________________________________________");
		boolean updatedData = service.updateTypeByName("Car", "Audi");
		System.out.println(updatedData);

		System.out.println("-----------------------update2Fields-------------------------------------------------");
		boolean updated = service.updateLaunchedInAndPowerById(2, "15-05-2023", 80);
		System.out.println(updated);

		System.out.println("___________________DeleteByLaunchedIn_______________________________________________");
//		service.deleteByLaunchedIn("15-07-2012");

		System.out.println("-----------------------ReadAll--------------------------------------------------------");
		List<VehicleDto> readData = service.readAll();
		for (VehicleDto dtos : readData) {
			System.out.println(dtos);
		}

	}

}
