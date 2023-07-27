package com.xworkz.foodstall.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Table (name = "food_infoo") 
@NamedQuery(name = "findById", query = "select dto from FoodStallDto dto where dto.id=:fd")
@NamedQuery(name = "findByName", query = "select dto from FoodStallDto dto where dto.foodName=:fn")
@NamedQuery(name = "updateNameById", query = "update FoodStallDto dto set dto.stallName=:sn where dto.id=:id")
@NamedQuery(name = "updateCostAndLocation", query = "update FoodStallDto dto set dto.cost=:fc, dto.location=:fl where dto.foodName=:fd")
@NamedQuery(name = "deleteById", query = "delete from FoodStallDto dto where id=:di")
@NamedQuery(name = "readAll", query = "select dto from FoodStallDto dto")
@Entity
public class FoodStallDto {

	@Id
	private int id;
	@NotBlank
	@NotEmpty
	@Size (min=2, max=50)
	private String stallName;
	@NotBlank
	@NotEmpty
	private String foodName;
	private int cost;
	@NotBlank
	@NotEmpty
	private String location;
	private int noOfFoodVarieties;
	@NotBlank
	@NotEmpty
	private String taste;

	public FoodStallDto() {
		super();
	}

	public FoodStallDto(int id, String stallName, String foodName, int cost, String location, int noOfFoodVarieties,
			String taste) {
		super();
		this.id = id;
		this.stallName = stallName;
		this.foodName = foodName;
		this.cost = cost;
		this.location = location;
		this.noOfFoodVarieties = noOfFoodVarieties;
		this.taste = taste;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfFoodVarieties() {
		return noOfFoodVarieties;
	}

	public void setNoOfFoodVarieties(int noOfFoodVarieties) {
		this.noOfFoodVarieties = noOfFoodVarieties;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "FoodStallDto [id=" + id + ", stallName=" + stallName + ", foodName=" + foodName + ", cost="
				+ cost + ", location=" + location + ", noOfFoodVarieties=" + noOfFoodVarieties + ", taste=" + taste
				+ "]";
	}

}
