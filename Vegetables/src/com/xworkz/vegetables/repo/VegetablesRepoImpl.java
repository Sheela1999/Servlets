package com.xworkz.vegetables.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.vegetables.config.VegetablesConfig;
import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesRepoImpl implements VegetablesRepo {

	SessionFactory factory = VegetablesConfig.getSessionFactory();
	
	@Override
	public boolean save(VegetablesDto dto) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(dto);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public VegetablesDto findByName(String name) {
		Session session = factory.openSession();
		Query<VegetablesDto> query = session.createQuery("From VegetablesDto where name=" + name, VegetablesDto.class);
		VegetablesDto dto = query.getSingleResult();
		return dto;
	}

	@Override
	public VegetablesDto findTypeByName(String name, String type) {
		Session session = factory.openSession();
		Query<VegetablesDto> query = session.createQuery("From VegetablesDto where name=" + name, VegetablesDto.class);
		VegetablesDto dto = query.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateNutrientsByName(String name, String nutrients) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		VegetablesDto dto = findByName(name);
		dto.setNutrients(nutrients);
		session.update(dto);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public boolean updatePriceAndColorByName(String name, int price, String color) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		VegetablesDto dto = findByName(name);
		dto.setPrice(price);
		dto.setColor(color);
		session.update(dto);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteByPrice(int price) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Query<VegetablesDto> query = session.createQuery("From VegetablesDto where price=" + price, VegetablesDto.class);
		VegetablesDto dtos = query.getSingleResult();
		session.delete(dtos);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public List<VegetablesDto> readAll() {
		Session session = factory.openSession();
		Query query = session.createQuery("From VegetablesDto");
		List<VegetablesDto> list = query.list();
		return list;
	}

}
