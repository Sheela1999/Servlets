package com.xworkz.airpods.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Table(name = "airpods")
@AllArgsConstructor
@NamedQuery(name = "updateColorbyName", query = "Update AirpodsDto dto set dto.color=:col where dto.brandName=:nm")
@NamedQuery(name = "deleteByPrice", query = "Delete from AirpodsDto dto where dto.price=:pr")
@NamedQuery(name = "readAll", query = "select dto from AirpodsDto dto")
@Entity
public class AirpodsDto {

	@Id
	private int id;
	private String brandName;
	private int price;
	private String color;
	private int batteryBackup;

	public AirpodsDto() {
		super();
	}

	public AirpodsDto(int id, String brandName, int price, String color, int batteryBackup) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.price = price;
		this.color = color;
		this.batteryBackup = batteryBackup;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBatteryBackup() {
		return batteryBackup;
	}

	public void setBatteryBackup(int batteryBackup) {
		this.batteryBackup = batteryBackup;
	}

	@Override
	public String toString() {
		return "AirpodsDto [id=" + id + ", brandName=" + brandName + ", price=" + price + ", color=" + color
				+ ", batteryBackup=" + batteryBackup + "]";
	}

}
