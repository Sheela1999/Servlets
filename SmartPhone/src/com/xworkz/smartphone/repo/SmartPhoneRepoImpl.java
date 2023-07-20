package com.xworkz.smartphone.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.smartphone.config.SmartPhoneConfig;
import com.xworkz.smartphone.dto.SmartPhoneDto;

public class SmartPhoneRepoImpl implements SmartPhoneRepo {
	
	SessionFactory factory = SmartPhoneConfig.getSessionFactory();

	@Override
	public boolean save(SmartPhoneDto dto) {
		Session session = factory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		session.save(dto);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public SmartPhoneDto findById(int id) {
		Session session = factory.openSession();
		SmartPhoneDto dto = session.get(SmartPhoneDto.class, id);
		return dto;
	}

	@Override
	public List<SmartPhoneDto> readAll() {
		Session session = factory.openSession();
		Query query = session.createQuery("From SmartPhoneDto");
		List<SmartPhoneDto> lists = query.list();
		//lists.forEach((l) ->{ System.out.println(l);});
		return lists;
	}
	
	@Override
	public boolean update(SmartPhoneDto dto) {
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.update(dto);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public boolean delete(SmartPhoneDto dto) {
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.delete(dto);
		transaction.commit();
		session.close();
		return true;
	}
	
	@Override
	public boolean deleteById(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		SmartPhoneDto dtos = session.find(SmartPhoneDto.class, id);
		session.delete(dtos);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public boolean updateByBrand(String brand, long model) {
		Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
		transaction.begin();
		Query<SmartPhoneDto> query = session.createQuery("From SmartPhoneDto where brand="+ brand, SmartPhoneDto.class);
		SmartPhoneDto dtos = query.getSingleResult();
		dtos.setModel(model);
		session.update(dtos);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteByType(String type) {
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		Query<SmartPhoneDto> query = session.createQuery("From SmartPhoneDto where type=" +type, SmartPhoneDto.class);
		SmartPhoneDto delete = query.getSingleResult();
		session.delete(delete);
		transaction.commit();
		session.close();
		return true;
	}

}
