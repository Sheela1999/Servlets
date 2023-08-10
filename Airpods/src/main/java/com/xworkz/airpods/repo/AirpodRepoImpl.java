package com.xworkz.airpods.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.airpods.dto.AirpodsDto;

public class AirpodRepoImpl implements AirpodsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("data-connection");
	EntityManager em = emf.createEntityManager();

	public boolean store(AirpodsDto dto) {

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			transaction.commit();
			return true;
	}

	public boolean updateColorByName(String color, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateColorbyName");

			query.setParameter("col", color);
			query.setParameter("nm", name);
			query.executeUpdate();
			System.out.println("updated");
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean deleteByPrice(int price) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByPrice");
			query.setParameter("pr", price);
            query.executeUpdate();
            em.getTransaction().commit();
			return true;
	}

	public List<AirpodsDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll");
		List list =  query.getResultList();
		return list;
		
	}

}
