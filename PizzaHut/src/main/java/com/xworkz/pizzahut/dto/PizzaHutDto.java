package com.xworkz.pizzahut.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PizzaHutDto {

	@NotBlank
	@NotEmpty
	private String pizzaName;
	@NotBlank
	@NotEmpty
	private String pizzaType;
	@NotBlank
	@NotEmpty
	@Size(min = 3, max = 20)
	private String size;
	@NotBlank
	@NotEmpty
	private String location;
	@NotBlank
	@NotEmpty
	private String paymentMode;

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "PizzaHutDto [pizzaName=" + pizzaName + ", pizzaType=" + pizzaType + ", size=" + size + ", location="
				+ location + ", paymentMode=" + paymentMode + "]";
	}

}
