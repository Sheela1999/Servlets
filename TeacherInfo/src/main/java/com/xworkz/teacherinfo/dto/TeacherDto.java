package com.xworkz.teacherinfo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Table(name = "teacher_info")
@Entity
public class TeacherDto {

	@Id
	private int id;
	@NotBlank
	@NotEmpty
	private String name;
	private int salary;
	@NotBlank
	@NotEmpty
	private String qualification;
	@NotBlank
	@NotEmpty
	private String teachingSub;
	@NotBlank
	@NotEmpty
	private String location;

	public TeacherDto() {
		System.out.println("No args Constructor");
	}

	public TeacherDto(int id, String name, int salary, String qualification, String teachingSub, String location) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.qualification = qualification;
		this.teachingSub = teachingSub;
		this.location = location;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getTeachingSub() {
		return teachingSub;
	}

	public void setTeachingSub(String teachingSub) {
		this.teachingSub = teachingSub;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "TeacherDto [id=" + id + ", name=" + name + ", salary=" + salary + ", qualification=" + qualification
				+ ", teachingSub=" + teachingSub + ", location=" + location + "]";
	}

}
