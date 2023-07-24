package com.xworkz.car.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.xworkz.car.constants.FuelType;

@Table(name = "car_info")
@Entity
public class CarDto {

	@Id
	private int id;
	@NotBlank
	@NotEmpty
	private String brandName;
	private int price;
	@NotBlank
	@NotEmpty
	private String mileage;
	@NotBlank
	@NotEmpty
	private String engine;
	private FuelType type;
	@NotBlank
	@NotEmpty
	private String color;
	@NotBlank
	@NotEmpty
	private String warranty;
	private boolean canWeGetOffersOnCar;
	@NotBlank
	@NotEmpty
	private String power;
	@NotBlank
	@NotEmpty
	private String safety;

	public CarDto() {
		System.out.println("No args constructor");
	}

	public CarDto(int id, String brandName, int price, String mileage, String engine, FuelType type, String color,
			String warranty, boolean canWeGetOffersOnCar, String power, String safety) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.price = price;
		this.mileage = mileage;
		this.engine = engine;
		this.type = type;
		this.color = color;
		this.warranty = warranty;
		this.canWeGetOffersOnCar = canWeGetOffersOnCar;
		this.power = power;
		this.safety = safety;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public FuelType getType() {
		return type;
	}

	public void setType(FuelType type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public boolean isCanWeGetOffersOnCar() {
		return canWeGetOffersOnCar;
	}

	public void setCanWeGetOffersOnCar(boolean canWeGetOffersOnCar) {
		this.canWeGetOffersOnCar = canWeGetOffersOnCar;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getSafety() {
		return safety;
	}

	public void setSafety(String safety) {
		this.safety = safety;
	}

	@Override
	public String toString() {
		return "CarDto [id=" + id + ", brandName=" + brandName + ", price=" + price + ", mileage=" + mileage + ", engine="
				+ engine + ", type=" + type + ", color=" + color + ", warranty=" + warranty + ", canWeGetOffersOnCar="
				+ canWeGetOffersOnCar + ", power=" + power + ", safety=" + safety + "]";
	}

}
