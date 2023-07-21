package com.xworkz.engineer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.engineer.dto.EngineerDto;

public class EngineerStarter {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("engineer-connection");

		EntityManager em = emf.createEntityManager();

		EngineerDto dto = new EngineerDto(1, "Aishu", "EEE", "B.E", 20000, "Embedded Engineer");

		EngineerDto dto1 = new EngineerDto(2, "Sangeetha", "EC", "B.E", 40000, "Software Engineer");

		EngineerDto dto2 = new EngineerDto(3, "Pallavi", "PCM", "BSc", 28000, "Professional Enginner");

		EngineerDto dto3 = new EngineerDto(4, "Riya", "Civil", "Diploma", 20000, "Software Developer");

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

//         em.persist(dto);
//         em.persist(dto1);
//         em.persist(dto2);
//         em.persist(dto3);

//        EngineerDto foundData = em.find(EngineerDto.class, 3);
//        System.out.println(foundData);

		System.out
				.println("-------------------------------------------------------------------------------------------");

		EngineerDto updated = em.merge(dto3);
		System.out.println(updated);

		System.out
				.println("------------------------------------------------------------------------------------------");

//		em.remove(em.getReference(EngineerDto.class, 2));
		em.remove(em.find(EngineerDto.class, 2));

		transaction.commit();

		em.close();
	}

}
