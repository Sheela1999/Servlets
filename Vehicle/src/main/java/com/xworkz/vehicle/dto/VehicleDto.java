package com.xworkz.vehicle.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Table (name = "vehicle_info")
@NamedQuery(name = "findByName", query = "select dto from VehicleDto dto where dto.name=:nm")
@NamedQuery(name = "findByConsumesAndPower", query = "select dto from VehicleDto dto where dto.consumes=:cm and dto.power=:pw")
@NamedQuery(name = "updateTypeByName", query = "update from VehicleDto dto set dto.type=:tp where dto.name=:na")
@NamedQuery(name = "updateLaunchedInAndPower", query = "update from VehicleDto dto set dto.launchedIn=:li, dto.power=:pr where dto.id=:id")
@NamedQuery(name = "deleteByLaunchedIn", query = "delete from VehicleDto dto where dto.launchedIn=:lc")
@NamedQuery(name = "readAll", query = "select dto from VehicleDto dto")
@Entity
public class VehicleDto {

	@Id
	private int id;
	@NotBlank
	@NotEmpty
	private String name;
	@NotBlank
	@NotEmpty
	private String type;
	@NotBlank
	@NotEmpty
	private String consumes;
	private int power;
	@NotBlank
	@NotEmpty
	private String launchedIn;

	public VehicleDto() {
		super();
	}

	public VehicleDto(int id, String name, String type, String consumes, int power, String launchedIn) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.consumes = consumes;
		this.power = power;
		this.launchedIn = launchedIn;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConsumes() {
		return consumes;
	}

	public void setConsumes(String consumes) {
		this.consumes = consumes;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getLaunchedIn() {
		return launchedIn;
	}

	public void setLaunchedIn(String launchedIn) {
		this.launchedIn = launchedIn;
	}

	@Override
	public String toString() {
		return "VehicleDto [id=" + id + ", name=" + name + ", type=" + type + ", consumes=" + consumes + ", power="
				+ power + ", launchedIn=" + launchedIn + "]";
	}

}
