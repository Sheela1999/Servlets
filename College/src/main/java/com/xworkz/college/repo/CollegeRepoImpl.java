package com.xworkz.college.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepoImpl implements CollegeRepo {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("college-connection");
	private EntityManager em = emf.createEntityManager();
	
	@Override
	public String save(CollegeDto dto) {
		System.out.println("repo dto is valid");
		System.out.println(dto);
			System.out.println("save method from Repo");
			if(em!=null) {
				em.getTransaction().begin();
				em.persist(dto);
				System.out.println("data saved");
				System.out.println(dto);
				em.getTransaction().commit();
				return "data saved successfully";
				
			}
			System.out.println("data is null");
			return null;
	}

	@Override
	public List<CollegeDto> readAll() {
			Query query = em.createNamedQuery("readAll");
			List<CollegeDto> data = query.getResultList();
			return data;
	}

}
