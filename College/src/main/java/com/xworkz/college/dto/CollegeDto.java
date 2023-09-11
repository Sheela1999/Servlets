package com.xworkz.college.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "college_infos")
@NamedQuery(name = "readAll", query = "select dto from CollegeDto dto")
public class CollegeDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	private String noOfStudents;
	private String noOfStaffs;

	public CollegeDto() {
		super();
	}

	public CollegeDto(String name, String location, String noOfStudents, String noOfStaffs) {
		super();
		this.name = name;
		this.location = location;
		this.noOfStudents = noOfStudents;
		this.noOfStaffs = noOfStaffs;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getNoOfStudents() {
		return noOfStudents;
	}

	public String getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setNoOfStudents(String noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public void setNoOfStaffs(String noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}
	
	@Override
	public String toString() {
		return "CollegeDto [id=" + id + ", name=" + name + ", location=" + location + ", noOfStudents=" + noOfStudents
				+ ", noOfStaffs=" + noOfStaffs + "]";
	}

}
