package com.xworkz.teacherinfo.service;

import java.util.List;

import com.xworkz.teacherinfo.dto.TeacherDto;

public interface TeacherService {
	
	public boolean save(TeacherDto dto);
	
	public List<TeacherDto> readAll();
	
	public TeacherDto findById(int id);
	
	public TeacherDto findByName(String name);
	
	public boolean updateById(int id, int salary);
	
	public boolean updateByNameAndId(String name, int id, String subject);
	
	public boolean deleteById(int id);

}
