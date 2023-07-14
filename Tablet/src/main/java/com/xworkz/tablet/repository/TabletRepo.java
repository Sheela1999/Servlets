package com.xworkz.tablet.repository;

import java.sql.ResultSet;

import com.xworkz.tablet.dto.TabletDto;

public interface TabletRepo {
	
	public boolean save(TabletDto dto);
	
	public ResultSet find(TabletDto dto, String companyName);

}
