package com.xworkz.smartphone;

import java.util.List;

import com.xworkz.smartphone.dto.SmartPhoneDto;
import com.xworkz.smartphone.service.SmartPhoneService;
import com.xworkz.smartphone.service.SmartPhoneServiceImpl;

public class SmartPhoneRunner {

	public static void main(String[] args) {

		SmartPhoneDto dto = new SmartPhoneDto(1, "Vivo", 15000, "Black", "Android", 1606l);
		
		SmartPhoneDto dto1 = new SmartPhoneDto(2, "Samsung", 10000, "Grey", "Windows Phones", 1990l);
		
		SmartPhoneDto dto2 = new SmartPhoneDto(3, "Apple", 50000, "Midnight", "iPhone", 16996l);
		
		SmartPhoneDto dto3 = new SmartPhoneDto(4, "Redmi", 25000, "SkyBlue", "Amazon's Fire Phone", 1808l);
		
		SmartPhoneDto dto4 = new SmartPhoneDto(5, "RealMe", 18000, "Gold", "Androids", 1851l);

		SmartPhoneService service = new SmartPhoneServiceImpl();

//		boolean status = service.save(dto);
//		System.out.println(status);
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
		
//		service.update(dto4);
		System.out.println("---------------------------------------------------------------");
//		service.delete(dto3);
		
		System.out.println("------------------------------------------------------------------");
		
//    	boolean deleted = service.deleteById(2);
//		System.out.println(deleted);
		
		System.out.println("______________________________________________________________________");
		
//		service.updateByBrand("'Apple'", 1706l);
//		service.deleteByType("'Android'");
		System.out.println("-------------------------------------------------------------------------");
		
		SmartPhoneDto returnedData = service.findById(3);
        System.out.println(returnedData);
        
        System.out.println("------------------------------------------------------------------------");
        
        List<SmartPhoneDto> listedData = service.readAll();
        //System.out.println(listedData);
       
       listedData.forEach((l) -> System.out.println(l));
	}

}
