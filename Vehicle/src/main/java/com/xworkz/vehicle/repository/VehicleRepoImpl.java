package com.xworkz.vehicle.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.vehicle.dto.VehicleDto;

public class VehicleRepoImpl implements VehicleRepo {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vehicle-connection");
	
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(VehicleDto dto) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		return true;
	}

	@Override
	public VehicleDto findByName(String name) {
		TypedQuery<VehicleDto> query = em.createNamedQuery("findByName", VehicleDto.class);
		query.setParameter("nm", name);
		VehicleDto found = query.getSingleResult();
		return found;
	}

	@Override
	public VehicleDto FindByConsumesAndPower(String consumes, int power) {
		TypedQuery<VehicleDto> query = em.createNamedQuery("findByConsumesAndPower", VehicleDto.class);
		query.setParameter("cm", consumes);
		query.setParameter("pw", power);
		VehicleDto FoundData = query.getSingleResult();
		return FoundData;
	}

	@Override
	public boolean updateTypeByName(String type, String name) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateTypeByName");
		query.setParameter("tp", type);
		query.setParameter("na", name);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateLaunchedInAndPowerById(int id, String launchedIn, int power) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateLaunchedInAndPower");
		query.setParameter("li", launchedIn);
		query.setParameter("pr", power);
		query.setParameter("id", id);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteByLaunchedIn(String launchedIn) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("deleteByLaunchedIn");
		query.setParameter("lc", launchedIn);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public List<VehicleDto> readAll() {
		TypedQuery<VehicleDto> query= em.createNamedQuery("readAll", VehicleDto.class);
		List<VehicleDto> list = query.getResultList();
		return list;
	}

}
