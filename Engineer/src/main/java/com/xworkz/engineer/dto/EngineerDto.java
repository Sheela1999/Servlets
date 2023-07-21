package com.xworkz.engineer.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "engineer")
@Entity
public class EngineerDto {

	@Id
	private int id;
	private String name;
	private String Stream;
	private String qualification;
	private int salary;
	private String designation;

	public EngineerDto() {
		System.out.println("No args Constructor");
	}

	public EngineerDto(int id, String name, String stream, String qualification, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		Stream = stream;
		this.qualification = qualification;
		this.salary = salary;
		this.designation = designation;
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

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "EngineerDto [id=" + id + ", name=" + name + ", Stream=" + Stream + ", qualification=" + qualification
				+ ", salary=" + salary + ", designation=" + designation + "]";
	}

}
