package com.xworkz.election.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.election.dto.ElectionDto;

public class ElectionRepoImpl {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("servlets-connection");
	EntityManager em = emf.createEntityManager();
	
	public boolean save(ElectionDto dto) {
		
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;	
	}

	public List<ElectionDto> readAll() {
	
			Query query = em.createNamedQuery("readAll");
			List list = query.getResultList();
			return list;
	}

}
