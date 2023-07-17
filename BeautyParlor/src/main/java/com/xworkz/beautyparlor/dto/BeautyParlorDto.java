package com.xworkz.beautyparlor.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class BeautyParlorDto {
	
	private String id;
	@NotBlank
	@NotEmpty
	private String firstName;
	@NotBlank
	@NotEmpty
	private String lastName;
	@NotBlank
	@NotEmpty
	private String gender;
	@NotBlank
	@NotEmpty
	private String phoneNumber;
	@NotBlank
	@NotEmpty
	private String email;
	@NotBlank
	@NotEmpty
	private String city;
	@NotBlank
	@NotEmpty
	private String serviceCategory;
	@NotBlank
	@NotEmpty
	private String treatments;
	@NotBlank
	@NotEmpty
	private String makeUpStyles;
	private String date;
	private String time;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getServiceCategory() {
		return serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	public String getTreatments() {
		return treatments;
	}
	public void setTreatments(String treatments) {
		this.treatments = treatments;
	}
	public String getMakeUpStyles() {
		return makeUpStyles;
	}
	public void setMakeUpStyles(String makeUpStyles) {
		this.makeUpStyles = makeUpStyles;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "BeautyParlorDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", city=" + city + ", serviceCategory="
				+ serviceCategory + ", treatments=" + treatments + ", makeUpStyles=" + makeUpStyles + ", date=" + date
				+ ", time=" + time + "]";
	}
	
	
	

}
