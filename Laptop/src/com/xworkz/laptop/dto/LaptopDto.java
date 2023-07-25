package com.xworkz.laptop.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Table(name = "laptop")
@Entity
public class LaptopDto {

	@Id
	private int id;
	@NotBlank
	@NotEmpty
	@Size (min=2, max=50)
	private String brand;
	private int price;
	@NotBlank
	@NotEmpty
	private String storage;
	@NotBlank
	@NotEmpty
	private String processor;
	private String generation;

	public LaptopDto() {
		System.out.println("no args constructor");
	}

	public LaptopDto(int id, String brand, int price, String storage, String processor, String generation) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.storage = storage;
		this.processor = processor;
		this.generation = generation;
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

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	@Override
	public String toString() {
		return "LaptopDto [id=" + id + ", brand=" + brand + ", price=" + price + ", storage=" + storage + ", processor="
				+ processor + ", generation=" + generation + "]";
	}

}
