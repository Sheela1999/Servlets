package com.xworkz.vegetables.service;

import java.util.List;

import com.xworkz.vegetables.dto.VegetablesDto;
import com.xworkz.vegetables.repo.VegetablesRepoImpl;

public class VegetablesServiceImpl implements VegetablesService {
	
	VegetablesRepoImpl repo = new VegetablesRepoImpl();

	@Override
	public boolean save(VegetablesDto dto) {
		if(dto != null) {
			if(dto.getName() != null && dto.getName().length()>3) {
				if(dto.getPrice()> 20) {
					if(dto.getNutrients() != null) {
						if(dto.getType() != null) {
							if(dto.getColor() != null) {
								System.out.println("dto is Validated");
								repo.save(dto);
								return true;
							}
							System.out.println("color is not valid");
							return false;
						}
						System.out.println("type is not valid");
						return false;
					}
					System.out.println("nutrients are not valid");
					return false;
				}
				System.out.println("price is not valid");
				return false;
			}
			System.out.println("name is not valid");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public VegetablesDto findByName(String name) {
		if(name != null) {
			return repo.findByName(name);
		}
		System.out.println("name is not valid");
		return null;
	}

	@Override
	public VegetablesDto findTypeByName(String name, String type) {
		if(name != null) {
			if(type != null) {
				return repo.findTypeByName(name, type);
			}
			System.out.println("type is not valid");
			return null;
		}
		System.out.println("name is not valid");
		return null;
	}

	@Override
	public boolean updateNutrientsByName(String name, String nutrients) {
		if(name != null) {
			if(nutrients != null) {
				repo.updateNutrientsByName(name, nutrients);
				return true;
			}
			System.out.println("nutrients is not valid");
			return false;
		}
		System.out.println("name is not valid");
		return false;
	}

	@Override
	public boolean updatePriceAndColorByName(String name, int price, String color) {
		if(name != null) {
			if(price>20) {
				if(color != null) {
					return repo.updatePriceAndColorByName(name, price, color);
				}
				System.out.println("color is not valid");
				return false;
			}
			System.out.println("price is not valid");
			return false;
		}
		System.out.println("name is not valid");
		return false;
	}

	@Override
	public boolean deleteByPrice(int price) {
		if(price>20) {
			return repo.deleteByPrice(price);
		}
		return false;
	}

	@Override
	public List<VegetablesDto> readAll() {
		List<VegetablesDto> read = repo.readAll();
		return read;
	}

}
