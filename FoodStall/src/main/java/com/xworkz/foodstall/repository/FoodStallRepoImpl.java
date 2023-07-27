package com.xworkz.foodstall.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.foodstall.dto.FoodStallDto;

public class FoodStallRepoImpl implements FoodStallRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("food-connection");
	
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(FoodStallDto dto) {
	    EntityTransaction transaction = em.getTransaction();
	    transaction.begin();
	    em.persist(dto);
	    transaction.commit();
		return true;
	}
	
	@Override
	public FoodStallDto findById(int id) {
		TypedQuery<FoodStallDto> query = em.createNamedQuery("findById", FoodStallDto.class);
		query.setParameter("fd", id);
	    FoodStallDto found = query.getSingleResult();
		return found;
	}

	@Override
	public FoodStallDto findByName(String name) {
		TypedQuery<FoodStallDto> query = em.createNamedQuery("findByName", FoodStallDto.class);
		query.setParameter("fn", name);
	    FoodStallDto dto = query.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateNameById(int id, String name) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateNameById");
		query.setParameter("id", id);
		query.setParameter("sn", name);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateCostAndLocationByName(String name, int cost, String location) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateCostAndLocation");
		query.setParameter("fd", name);
		query.setParameter("fc", cost);
		query.setParameter("fl", location);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("deleteById");
		query.setParameter("di", id);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public List<FoodStallDto> readAll() {
	    TypedQuery<FoodStallDto> query = em.createNamedQuery("readAll", FoodStallDto.class);
	    List<FoodStallDto> readData = query.getResultList();
		return readData;
	}

	
}
