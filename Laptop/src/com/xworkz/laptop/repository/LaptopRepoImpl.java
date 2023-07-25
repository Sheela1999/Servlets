package com.xworkz.laptop.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.laptop.config.LaptopConfig;
import com.xworkz.laptop.dto.LaptopDto;

public class LaptopRepoImpl implements LaptopRepo {

	SessionFactory factory = LaptopConfig.getSessionFactory();

	@Override
	public boolean save(LaptopDto dto) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public List<LaptopDto> readAll() {
		Session session = factory.openSession();
		Query query = session.createQuery("From LaptopDto");
		List<LaptopDto> list = query.list();
		return list;
	}

	@Override
	public LaptopDto findById(int id) {
		Session session = factory.openSession();
		LaptopDto dto = session.find(LaptopDto.class, id);
		return dto;
	}

	@Override
	public LaptopDto findByName(String name) {
		Session session = factory.openSession();
		String query = "From LaptopDto where brand =" + name;
		Query<LaptopDto> query1 = session.createQuery(query, LaptopDto.class);
		LaptopDto dto = query1.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateById(int id, String processor) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		LaptopDto dto = findById(id);
		dto.setProcessor(processor);
		session.update(dto);
		transaction.commit();
		session.close();
		System.out.println("Name is Updated");
		return true;
	}

	@Override
	public boolean updateByNameAndId(String name, int id, int price) {
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		LaptopDto dto1 = findById(id);
		System.out.println(dto1 +"By Id");
		LaptopDto dto2 = findByName(name);
		System.out.println(dto1+ "By Name");
		if(dto1.getId()==dto2.getId()){
			if(dto1.getBrand().equals(dto2.getBrand())) {
				System.out.println("Data is matching");
				dto2.setPrice(price);
				session.update(dto2);
				transaction.commit();
				session.close();
				System.out.println("Data is updated");
				return true;
				
			}
			System.out.println("Name is not matching");
			return false;
			
		}
		System.out.println("Id is not matching");
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		LaptopDto dto = findById(id);
		session.delete(dto);
		transaction.commit();
		session.close();
		System.out.println("Data is deleted");
		return true;
	}

}
