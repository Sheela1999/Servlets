package com.xworkz.car.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.xworkz.car.dto.CarDto;

public class CarRepoImpl implements CarRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("car-connection");
	
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(CarDto dto) {
	EntityTransaction transaction = em.getTransaction();
	transaction.begin();
	em.persist(dto);
	transaction.commit();
		return true;
	}

	@Override
	public CarDto findById(int id) {
		CarDto found = em.find(CarDto.class, id);
		return found;
	}
	
	@Override
	public CarDto FindByName(String name) {
		TypedQuery<CarDto> query = em.createQuery("From CarDto where brandName=" + name, CarDto.class);
		CarDto dto = query.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateNameById(int id, String name) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		CarDto found = findById(id);
		found.setBrandName(name);
		em.merge(found);
		transaction.commit();
		return true;
	}
	
	@Override
	public boolean updateColorAndEngineByName(String color, String engine, String name) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		CarDto found = FindByName(name);
		found.setColor(color);
		found.setEngine(engine);
		em.merge(found);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		CarDto deleted = findById(id);
		deleted.getId();
		em.remove(deleted);
		transaction.commit();
		return true;
	}
	
	@Override
	public boolean deleteByPriceAndMileage(int price, String mileage) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		TypedQuery<CarDto> query = em.createQuery("from CarDto where price=" + price, CarDto.class);
		CarDto dto1 = query.getSingleResult();
		TypedQuery<CarDto> query1 = em.createQuery("from CarDto where mileage=" + mileage, CarDto.class);
		CarDto dto2 = query1.getSingleResult();
		if(dto1.equals(dto2)) {
			em.remove(dto2);
			System.out.println("Values are matching and Dto is deleted");
		transaction.commit();
		return true;
		}
		System.out.println("values are not matching");
		return false;
	}

	@Override
	public List<CarDto> readAll() {
		TypedQuery<CarDto> query = em.createQuery("From CarDto", CarDto.class);
		List<CarDto> read = query.getResultList();
		for (CarDto dtos : read) {
			System.out.println(dtos);
		}
		return read;
	}

	

	


}
