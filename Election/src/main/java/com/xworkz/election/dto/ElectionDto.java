package com.xworkz.election.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "election_infos")
@NamedQuery(name = "readAll", query = "select dto from ElectionDto dto")
@Entity

public class ElectionDto {

	@Id
	private String id;
	private String name;
	private String phoneNumber;
	private String age;
	private String address;
	private String pincode;

	public ElectionDto() {
		super();
	}

	public ElectionDto(String id, String name, String phoneNumber, String age, String address, String pincode) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.address = address;
		this.pincode = pincode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "ElectionDto [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", age=" + age
				+ ", address=" + address + ", pincode=" + pincode + "]";
	}

}
