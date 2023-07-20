package com.xworkz.smartphone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "smartphone")
@Entity
public class SmartPhoneDto {
	@Id
	private int id;
	private String brand;
	private int price;
	private String color;
	private String type;
	private long model;

	public SmartPhoneDto() {
		System.out.println("No args constructor");
	}

	public SmartPhoneDto(int id, String brand, int price, String color, String type, long model) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.type = type;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getModel() {
		return model;
	}

	public void setModel(long model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "SmartPhoneDto [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", type="
				+ type + ", model=" + model + "]";
	}

}
