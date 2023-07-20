package com.xworkz.vegetables.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "veg_info")
@Entity
public class VegetablesDto {

	@Id
	private int id;
	private String name;
	private int price;
	private String nutrients;
	private String type;
	private String color;

	public VegetablesDto() {
		System.out.println("No args constructor");
	}

	public VegetablesDto(int id, String name, int price, String nutrients, String type, String color) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.nutrients = nutrients;
		this.type = type;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getNutrients() {
		return nutrients;
	}

	public void setNutrients(String nutrients) {
		this.nutrients = nutrients;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "VegetablesDto [id=" + id + ", name=" + name + ", price=" + price + ", nutrients=" + nutrients
				+ ", type=" + type + ", color=" + color + "]";
	}

}
