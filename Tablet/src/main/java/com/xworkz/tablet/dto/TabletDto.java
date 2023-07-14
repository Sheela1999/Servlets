package com.xworkz.tablet.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class TabletDto {
	
	private String id;
	@NotBlank
	@NotEmpty
	private String tabletName;
	@NotBlank
	@NotEmpty
	private String dosage;
	private String manufacturingDate;
	private String tabletType;
	@NotBlank
	@NotEmpty
	private String companyName;
	private String expiringDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTabletName() {
		return tabletName;
	}
	public void setTabletName(String tabletName) {
		this.tabletName = tabletName;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getTabletType() {
		return tabletType;
	}
	public void setTabletType(String tabletType) {
		this.tabletType = tabletType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getExpiringDate() {
		return expiringDate;
	}
	public void setExpiringDate(String expiringDate) {
		this.expiringDate = expiringDate;
	}
	@Override
	public String toString() {
		return "TabletDto [id=" + id + ", tabletName=" + tabletName + ", dosage=" + dosage + ", manufacturingDate="
				+ manufacturingDate + ", tabletType=" + tabletType + ", companyName=" + companyName + ", expiringDate="
				+ expiringDate + "]";
	}

}
