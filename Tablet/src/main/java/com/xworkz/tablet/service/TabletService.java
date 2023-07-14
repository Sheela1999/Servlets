package com.xworkz.tablet.service;

import java.sql.ResultSet;

import com.xworkz.tablet.dto.TabletDto;

public interface TabletService {
	
    public boolean save(TabletDto dto);
	
	public ResultSet find(TabletDto dto, String companyName);

}
