package com.xworkz.teacherinfo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.xworkz.teacherinfo.dto.TeacherDto;

public class TeacherRepoImpl implements TeacherRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("teacher-connection");
	
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(TeacherDto dto) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		return true;
	}

	@Override
	public List<TeacherDto> readAll() {
		TypedQuery<TeacherDto> query = em.createQuery("From TeacherDto", TeacherDto.class);
		List<TeacherDto> list = query.getResultList();
		return list;
	}

	@Override
	public TeacherDto findById(int id) {
		TeacherDto found = em.find(TeacherDto.class, id);
		return found;
	}

	@Override
	public TeacherDto findByName(String name) {
		TypedQuery<TeacherDto> query = em.createQuery("From TeacherDto where name=" +name, TeacherDto.class);
	    return query.getSingleResult();	
	}

	@Override
	public boolean updateById(int id, int salary) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		TeacherDto dto = findById(id);
		dto.setSalary(salary);
		em.merge(dto);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateByNameAndId(String name, int id, String subject) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		TeacherDto dto = findByName(name);
		TeacherDto dto1 = findById(id);
		dto1.setTeachingSub(subject);
			TeacherDto updated = em.merge(dto);
			System.out.println(updated);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		TeacherDto dto = findById(id);
		em.remove(dto);
		return true;
	}

}
